## Logging comparison

### ArticleController
- has an explicitly delared logger

### HomeController
- makes use of @Slf4j, a lombok- provided annotation that will automatically generate SLF4J Logger in the class at runtime

## Mapping annotations
- @RequestMapping - general-purpose request handling
- @GetMapping - handles HTTP GET request
- Others - @PostMapping, @PutMapping, @DeleteMapping, @PatchMapping
- lengthier version: @RequestMapping(method=RequestMethod.GET)

## Terms
- SLF4J (Simple Logging Facade for Java) https://www.slf4j.org

***
