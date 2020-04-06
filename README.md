# Configurations

At your local tomcat folder, inside `conf` directory:
 
create `admin/test.yml` and `admin/bijay.yml` as mentioned in `DataSource.java` class

# Aesthetics
For testing purpose, make **test.yml** as 
```$xslt
server:
  name: bijay shrestha
```

Similarly, make **bijay.yml** as
```$xslt
hello:
  world: this is a big show!
  this:
    is: spring boot external file
```

Note: *Change the location of `tomcat` directory that suits your tomcat location in `Datasource.java` class*

# Output
Finally, 
Run `SpringBootYamlApplication.java` file to see the printed log.


