#Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

##[Unreleased]

##[0.27.0] - 2021-09-14
###Added 
- Workflow for build validation
- Workflow for Maven Preview and GitHub Releases 
- Workflow dispatch trigger to codeQL and api level lint
###Changed
- Generated beta models and request builders using Typewriter (#163)
- Juniper-engine from 5.7.2 to 5.8.0
- Juniper-api from 5.7.2 to 5.8.0 



# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added

### Changed

- Fixes a bug where empty title would make generation fail #558
- Fixes a bug where float, long and binary types would not be parsed by the generator #558
- Fixes a bug where generation would fail on compact namespace names #558
- Renames request info into request information to avoid conflicts with platform #559
- Fixes a bug where the server url would not be taken in consideration #626

## [0.0.8] - 2021-08-25

### Added

- Workflow for build validation
- Workflow for Maven Preview and GitHub Releases
- Workflow dispatch trigger to codeQL and api level lint

### Changed

- Generated beta models and request builders using Typewriter (#163)
- Juniper-api from 5.7.2 to 5.8.0
- Juniper-engine from 5.7.2 to 5.8.0 

