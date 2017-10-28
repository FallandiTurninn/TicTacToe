#!/bin/bash
set -e
echo "starting build"
git config --global user.name "Travis CI"
git config --global user.email "travis@travis-ci.org"
git checkout --orphan temp  # creates a new empty branch
git fetch origin master  # gets all the info from our main branch
git checkout origin/master -- docs # gets only the docs folder
git add docs
git commit -m "sending docs to FallandiTurninn.github.io"  
git remote add pages git@github.com:FallandiTurninn/FallandiTurninn.github.io.git  # makes a remote to out gitpages site
git push --quiet pages temp:master  #pushes to our gitpages site
# should go to the main branch and kill the temp branch
git remote rm pages
