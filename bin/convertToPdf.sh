#!/bin/bash
# convert the markdown documentation to pdf 
pandoc ./docs/Admin.md -s -o ./docs/Admin.html
pandoc ./docs/Design.md -s -o ./docs/Design.html
pandoc ./docs/Development.md -s -o ./docs/Development.html
