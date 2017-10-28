#!/bin/bash
pandoc ./docs/Admin.md -s -o ./docs/Admin.pdf
pandoc ./docs/Design.md -s -o ./docs/Design.pdf
pandoc ./docs/Development.md -s -o ./docs/Development.pdf
