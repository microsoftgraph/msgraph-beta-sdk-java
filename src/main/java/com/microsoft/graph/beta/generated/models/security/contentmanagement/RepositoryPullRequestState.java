package com.microsoft.graph.beta.models.security.contentmanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * State of a setup pull request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RepositoryPullRequestState implements ValuedEnum {
    /** Pull request is open. */
    Open("open"),
    /** Pull request is closed. */
    Closed("closed"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue"),
    /** Pull request was merged. */
    Merged("merged");
    public final String value;
    RepositoryPullRequestState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RepositoryPullRequestState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "open": return Open;
            case "closed": return Closed;
            case "unknownFutureValue": return UnknownFutureValue;
            case "merged": return Merged;
            default: return null;
        }
    }
}
