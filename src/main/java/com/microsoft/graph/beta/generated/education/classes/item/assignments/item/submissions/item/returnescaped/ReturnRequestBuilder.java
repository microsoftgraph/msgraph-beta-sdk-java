package com.microsoft.graph.beta.education.classes.item.assignments.item.submissions.item.returnescaped;

import com.microsoft.graph.beta.models.EducationSubmission;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the return method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReturnRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ReturnRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReturnRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/classes/{educationClass%2Did}/assignments/{educationAssignment%2Did}/submissions/{educationSubmission%2Did}/return", pathParameters);
    }
    /**
     * Instantiates a new {@link ReturnRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReturnRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/classes/{educationClass%2Did}/assignments/{educationAssignment%2Did}/submissions/{educationSubmission%2Did}/return", rawUrl);
    }
    /**
     * Make the grade and feedback associated with this submission available to the student. This will change the status of the submission from &apos;submitted&apos; to &apos;returned&apos; and indicates that feedback is provided or grading is done. This action can only be done by the teacher.
     * @return a {@link EducationSubmission}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/educationsubmission-return?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EducationSubmission post() {
        return post(null);
    }
    /**
     * Make the grade and feedback associated with this submission available to the student. This will change the status of the submission from &apos;submitted&apos; to &apos;returned&apos; and indicates that feedback is provided or grading is done. This action can only be done by the teacher.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EducationSubmission}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/educationsubmission-return?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EducationSubmission post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EducationSubmission::createFromDiscriminatorValue);
    }
    /**
     * Make the grade and feedback associated with this submission available to the student. This will change the status of the submission from &apos;submitted&apos; to &apos;returned&apos; and indicates that feedback is provided or grading is done. This action can only be done by the teacher.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Make the grade and feedback associated with this submission available to the student. This will change the status of the submission from &apos;submitted&apos; to &apos;returned&apos; and indicates that feedback is provided or grading is done. This action can only be done by the teacher.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ReturnRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReturnRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReturnRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
