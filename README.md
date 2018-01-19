# NAMD Parser
[NOMAD Laboratory CoE](http://nomad-coe.eu) parser for [NAMD](http://www.ks.uiuc.edu/Research/namd/)
## Version 0.0.2

This is the parser for NAMD Molecular Dynamics (namd2) in [NAMD](http://www.ks.uiuc.edu/Research/namd/).
The official version lives at:

    git@gitlab.mpcdf.mpg.de:nomad-lab/parser-namd.git

You can browse it at:

    https://gitlab.rzg.mpg.de/nomad-lab/parser-namd

It relies on having the nomad-meta-info and the python-common repositories one level higher.
The simplest way to have this is to check out nomad-lab-base recursively:

    git clone --recursive git@gitlab.mpcdf.mpg.de:nomad-lab/nomad-lab-base.git

This parser will be in the directory parsers/namd of this repository.

## Running and Testing the Parser
### Requirements
The required python packages can be installed with (see [python-common](https://gitlab.rzg.mpg.de/nomad-lab/python-common)):

    pip install -r nomad-lab-base/python-common/requirements.txt

### Usage
NAMD (namd2 executable) log output files can be parsed with:

    python NAMDParser.py [path/toFile]

### Test Files
Example log output files of NAMD can be found in the directory test/examples.
More details about the calculations and files will be explained in this README file.

