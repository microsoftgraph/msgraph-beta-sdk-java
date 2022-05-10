package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CredentialUsageSummary extends Entity implements Parsable {
    /** Represents the authentication method that the user used. Possible values are:email, mobileSMS, mobileCall, officePhone, securityQuestion (only used for self-service password reset), appNotification, appCode, alternateMobileCall (supported only in registration), fido, appPassword, unknownFutureValue. */
    private UsageAuthMethod _authMethod;
    /** Provides the count of failed resets or registration data. */
    private Long _failureActivityCount;
    /** Defines the feature to report. Possible values are: registration, reset, unknownFutureValue. */
    private FeatureType _feature;
    /** Provides the count of successful registrations or resets. */
    private Long _successfulActivityCount;
    /**
     * Instantiates a new credentialUsageSummary and sets the default values.
     * @return a void
     */
    public CredentialUsageSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a credentialUsageSummary
     */
    @javax.annotation.Nonnull
    public static CredentialUsageSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CredentialUsageSummary();
    }
    /**
     * Gets the authMethod property value. Represents the authentication method that the user used. Possible values are:email, mobileSMS, mobileCall, officePhone, securityQuestion (only used for self-service password reset), appNotification, appCode, alternateMobileCall (supported only in registration), fido, appPassword, unknownFutureValue.
     * @return a usageAuthMethod
     */
    @javax.annotation.Nullable
    public UsageAuthMethod getAuthMethod() {
        return this._authMethod;
    }
    /**
     * Gets the failureActivityCount property value. Provides the count of failed resets or registration data.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getFailureActivityCount() {
        return this._failureActivityCount;
    }
    /**
     * Gets the feature property value. Defines the feature to report. Possible values are: registration, reset, unknownFutureValue.
     * @return a featureType
     */
    @javax.annotation.Nullable
    public FeatureType getFeature() {
        return this._feature;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CredentialUsageSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authMethod", (n) -> { currentObject.setAuthMethod(n.getEnumValue(UsageAuthMethod.class)); });
            this.put("failureActivityCount", (n) -> { currentObject.setFailureActivityCount(n.getLongValue()); });
            this.put("feature", (n) -> { currentObject.setFeature(n.getEnumValue(FeatureType.class)); });
            this.put("successfulActivityCount", (n) -> { currentObject.setSuccessfulActivityCount(n.getLongValue()); });
        }};
    }
    /**
     * Gets the successfulActivityCount property value. Provides the count of successful registrations or resets.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSuccessfulActivityCount() {
        return this._successfulActivityCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("authMethod", this.getAuthMethod());
        writer.writeLongValue("failureActivityCount", this.getFailureActivityCount());
        writer.writeEnumValue("feature", this.getFeature());
        writer.writeLongValue("successfulActivityCount", this.getSuccessfulActivityCount());
    }
    /**
     * Sets the authMethod property value. Represents the authentication method that the user used. Possible values are:email, mobileSMS, mobileCall, officePhone, securityQuestion (only used for self-service password reset), appNotification, appCode, alternateMobileCall (supported only in registration), fido, appPassword, unknownFutureValue.
     * @param value Value to set for the authMethod property.
     * @return a void
     */
    public void setAuthMethod(@javax.annotation.Nullable final UsageAuthMethod value) {
        this._authMethod = value;
    }
    /**
     * Sets the failureActivityCount property value. Provides the count of failed resets or registration data.
     * @param value Value to set for the failureActivityCount property.
     * @return a void
     */
    public void setFailureActivityCount(@javax.annotation.Nullable final Long value) {
        this._failureActivityCount = value;
    }
    /**
     * Sets the feature property value. Defines the feature to report. Possible values are: registration, reset, unknownFutureValue.
     * @param value Value to set for the feature property.
     * @return a void
     */
    public void setFeature(@javax.annotation.Nullable final FeatureType value) {
        this._feature = value;
    }
    /**
     * Sets the successfulActivityCount property value. Provides the count of successful registrations or resets.
     * @param value Value to set for the successfulActivityCount property.
     * @return a void
     */
    public void setSuccessfulActivityCount(@javax.annotation.Nullable final Long value) {
        this._successfulActivityCount = value;
    }
}
