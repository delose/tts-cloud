# Engineering Manifest
- apply lessons learned from project experiences in favor of practicality, good practice, instead of blindly following written principles

## Don't proceed if you're too biased
- Some of the methodologies below may or may not apply in the context of a big enterprise microservice application
- Anyone in the future may edit or put in contradicting opinions

## Conventions

### choreography over orchestration
- messages between components should contain all the information necessary to trigger the next step in a business process
- use asynchronous event publication and avoid syncrhonous calls wherever possible

### business processes over CRUD operations
- events and commands must be easily understood and carry significant business value
- Events represent the result of a complete business process
- Commands represent an instruction to begin the execution of process to generate Event/s

### rapid feedback over comprehensive design specs
- apply Open-Close (Open for addition, close for modification) when introducing features
- build the next version of "Good enough", not "Perfect" software
- never compromise on measures of software quality
- next iteration/s should be lined up (and taken from product roadmap)
- allow other developers to give feedback and have discussions as much as possible
- start with core capabilities and finish with external system interfaces

### other things to keep in mind as a developer who is part of a team
- contributing to building tools for developers improves the experience of everyone
- leave the codebase in a better state than you found it
- proactively share knowledge to improve quality of product
- automating tasks gives more time to focus on innovation and qualityy
- community collaboration over code ownership to power faster delivery
- write README.md and CONTRIBUTING.md for every repository to lower barriers of contribution
- gauge the feedback and act on it when it makes the code world a better place
- favour radical transparency over private spaces to share information with less effort
- recognize, appreciate and call out good engineering behaviours in others to foster the engineering culture
- think in terms of impact on your contribution on the TTS Cloud over an individual (scrum) team

***

