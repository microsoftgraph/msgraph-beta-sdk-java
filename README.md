# Microsoft Graph SDK for Java

[![Download](https://api.bintray.com/packages/microsoftgraph/Maven/microsoft-graph-beta/images/download.svg) ](https://bintray.com/microsoftgraph/Maven/microsoft-graph/_latestVersion)

Get started with the Microsoft Graph SDK for Java by integrating the [Microsoft Graph API](https://developer.microsoft.com/en-us/graph/get-started/java) into your Java application!

> **Note:** this SDK allows you to build applications using the [beta](https://docs.microsoft.com/en-us/graph/use-the-api#version) of Microsoft Graph. If you want to use the production supported Microsoft Graph APIs under v1.0, use our [v1.0 SDK](https://github.com/microsoftgraph/msgraph-sdk-java) instead.

## 1. Installation

### 1.1 Install via Gradle

Add the repository and a compile dependency for `microsoft-graph-beta` to your project's `build.gradle`:

```gradle
repositories {
    jcenter()
    	jcenter{
        	url 'https://oss.jfrog.org/artifactory/oss-snapshot-local'
	}
}

dependencies {
    // Include the sdk as a dependency
    implementation 'com.microsoft.graph:microsoft-graph-beta:0.4.0-SNAPSHOT'
}
```

### 1.2 Install via Maven

Add the dependency in `dependencies` in pom.xml

```xml
<dependency>
  <groupId>com.microsoft.graph</groupId>
  <artifactId>microsoft-graph-beta</artifactId>
  <version>0.4.0-SNAPSHOT</version>
</dependency>
```

Add the repository in `repositories` in pom.xml

```xml
<repository>
  <id>sonatype-snapshot</id>
  <name>Sonatype Snapshot</name>
  <url>https://oss.sonatype.org/content/repositories/snapshots</url>
</repository>
```

>**Note:** if the `repositories` node doesn't exist, add it in `project`. For more information about the maven repositories configuration, [refer to this documentation](https://maven.apache.org/guides/mini/guide-multiple-repositories.html).

### 1.3 Enable ProGuard (Android)

The nature of the Graph API is such that the SDK needs quite a large set of classes to describe its functionality. You need to ensure that [ProGuard](https://developer.android.com/studio/build/shrink-code.html) is enabled on your project. Otherwise, you will incur long build times for functionality that is not necessarily relevant to your particular application. If you are still hitting the 64K method limit, you can also enable [multidexing](https://developer.android.com/studio/build/multidex.html). Checkout the [recommended rules](./docs/proguard-rules.txt).

## 2. Getting started

### 2.1 Register your application

Register your application by following the steps at [Register your app with the Azure AD v2.0 endpoint](https://developer.microsoft.com/en-us/graph/docs/concepts/auth_register_app_v2).

### 2.2 Create an IAuthenticationProvider object

An instance of the **GraphServiceClient** class handles building requests, sending them to the Microsoft Graph API, and processing the responses. To create a new instance of this class, you need to provide an instance of `IAuthenticationProvider`, which can authenticate requests to Microsoft Graph.

For an example of authentication in a Java desktop client application, see the [Preview msgraph-sdk-java-auth](https://github.com/microsoftgraph/msgraph-sdk-android-msa-auth-for-android-adapter) and for an Android application see [Preview msgraph-sdk-android-auth](https://github.com/microsoftgraph/msgraph-sdk-android-auth).

### 2.3 Get a GraphServiceClient object

After you have set the correct application ID and URL, you must get a **GraphServiceClient** object to make requests against the service. The SDK stores the account information for you, but when a user signs in for the first time, it invokes the UI to get the user's account information.

```java
IGraphServiceClient graphClient = 
  GraphServiceClient
    .builder()
    .authenticationProvider(authenticationProvider)
    .buildClient();
```

## 3. Make requests against the service

After you have a GraphServiceClient that is authenticated, you can begin making calls against the service. The requests against the service look like our [REST API](https://developer.microsoft.com/en-us/graph/docs/concepts/overview).

### 3.1 Get the user's drive

To retrieve the user's drive:

```java
graphClient
  .me()
  .drive()
  .buildRequest()
  .get(new ICallback<Drive>() {
     @Override
     public void success(final Drive result) {
        System.out.println("Found Drive " + result.id);
     }
     ...
     // Handle failure case
  });
```

For a general overview of how the SDK is designed, see [overview](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Overview).

## 4. Documentation

For more detailed documentation, see:

* [Overview](https://docs.microsoft.com/graph/overview)
* [Collections](https://docs.microsoft.com/graph/sdks/paging)
* [Making requests](https://docs.microsoft.com/graph/sdks/create-requests)
* [Known issues](https://github.com/MicrosoftGraph/msgraph-sdk-java/issues)
* [Contributions](https://github.com/microsoftgraph/msgraph-beta-sdk-java/blob/master/CONTRIBUTING.md)

## 5. Issues

For known issues, see [issues](https://github.com/MicrosoftGraph/msgraph-beta-sdk-java/issues).

## 6. Contributions

The Microsoft Graph SDK is open for contribution. To contribute to this project, see [Contributing](https://github.com/microsoftgraph/msgraph-beta-sdk-java/blob/master/CONTRIBUTING.md).

## 7. Supported Java versions

The Microsoft Graph beta SDK for Java library is supported at runtime for Java 8+ and [Android API revision 15](http://source.android.com/source/build-numbers.html) and greater through [desugaring](https://developer.android.com/studio/write/java8-support.html#library-desugaring).

## 8. License

Copyright (c) Microsoft Corporation. All Rights Reserved. Licensed under the [MIT license](LICENSE).

## 9. Third-party notices

[Third-party notices](THIRD%20PARTY%20NOTICES)


