# Use the OpenJDK 8 image as the base image
FROM openjdk:8

# Copy the jar file from host machine to image filesystem
COPY /out/artifacts/vol_converter_jar/vol_converter.jar /vol_converter.jar

# Run the jar file
CMD ["java", "-jar", "/vol_converter.jar"]
