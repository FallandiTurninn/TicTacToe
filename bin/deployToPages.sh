#!/bin/bash
set -e
echo "starting build"

# configures the git username and email so we can se that the push was made by travis
git config --global user.name "Travis CI"
git config --global user.email "travis@travis-ci.org"

# makes a remote to our gitpages site
git remote add pages https://@85688e3c18dfb0dfcf94f0011c82f48d86b2e0dgithub.com/FallandiTurninn/FallandiTurninn.github.io.git #git@github.com:FallandiTurninn/FallandiTurninn.github.io.git  
git checkout --orphan temp  # creates a new branch temp
git reset --hard # resets temp so we are working empty branch

# pulls our pages site master to the clean temp
# its done to resovle merge conflicts that will appear otherwise
git pull pages master
git rm -r docs # removes the docs folder and all its contents
git fetch origin master  # gets all the info from our main branch and stores it 
git checkout origin/master -- docs # gets only the docs folder from the stored master

# convert the markdown documentation to pdf 
pandoc ./docs/Admin.md -s -o ./docs/Admin.html
pandoc ./docs/Design.md -s -o ./docs/Design.html
pandoc ./docs/Development.md -s -o ./docs/Development.html

git add docs # adds docs to be pushed
git commit -m "Travis is sending docs to FallandiTurninn.github.io" # Travis commits it changes  
git push --quiet pages temp:master  # pushes the changes to our gitpages site
git checkout master # change the branch from temp to master

# Clean up our mess
git remote rm pages # removes the remote to pages 
git branch -D temp # kills the temporary branch 
