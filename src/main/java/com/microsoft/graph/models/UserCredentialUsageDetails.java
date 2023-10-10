package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserCredentialUsageDetails extends Entity implements Parsable {
    /**
     * The authMethod property
     */
    private UsageAuthMethod authMethod;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime eventDateTime;
    /**
     * Provides the failure reason for the corresponding reset or registration workflow.
     */
    private String failureReason;
    /**
     * The feature property
     */
    private FeatureType feature;
    /**
     * Indicates success or failure of the workflow.
     */
    private Boolean isSuccess;
    /**
     * User name of the user performing the reset or registration workflow.
     */
    private String userDisplayName;
    /**
     * User principal name of the user performing the reset or registration workflow.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new UserCredentialUsageDetails and sets the default values.
     */
    public UserCredentialUsageDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserCredentialUsageDetails
     */
    @jakarta.annotation.Nonnull
    public static UserCredentialUsageDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserCredentialUsageDetails();
    }
    /**
     * Gets the authMethod property value. The authMethod property
     * @return a UsageAuthMethod
     */
    @jakarta.annotation.Nullable
    public UsageAuthMethod getAuthMethod() {
        return this.authMethod;
    }
    /**
     * Gets the eventDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.eventDateTime;
    }
    /**
     * Gets the failureReason property value. Provides the failure reason for the corresponding reset or registration workflow.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFailureReason() {
        return this.failureReason;
    }
    /**
     * Gets the feature property value. The feature property
     * @return a FeatureType
     */
    @jakarta.annotation.Nullable
    public FeatureType getFeature() {
        return this.feature;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authMethod", (n) -> { this.setAuthMethod(n.getEnumValue(UsageAuthMethod.class)); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failureReason", (n) -> { this.setFailureReason(n.getStringValue()); });
        deserializerMap.put("feature", (n) -> { this.setFeature(n.getEnumValue(FeatureType.class)); });
        deserializerMap.put("isSuccess", (n) -> { this.setIsSuccess(n.getBooleanValue()); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isSuccess property value. Indicates success or failure of the workflow.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }
    /**
     * Gets the userDisplayName property value. User name of the user performing the reset or registration workflow.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userPrincipalName property value. User principal name of the user performing the reset or registration workflow.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("authMethod", this.getAuthMethod());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("failureReason", this.getFailureReason());
        writer.writeEnumValue("feature", this.getFeature());
        writer.writeBooleanValue("isSuccess", this.getIsSuccess());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the authMethod property value. The authMethod property
     * @param value Value to set for the authMethod property.
     */
    public void setAuthMethod(@jakarta.annotation.Nullable final UsageAuthMethod value) {
        this.authMethod = value;
    }
    /**
     * Sets the eventDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the eventDateTime property.
     */
    public void setEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.eventDateTime = value;
    }
    /**
     * Sets the failureReason property value. Provides the failure reason for the corresponding reset or registration workflow.
     * @param value Value to set for the failureReason property.
     */
    public void setFailureReason(@jakarta.annotation.Nullable final String value) {
        this.failureReason = value;
    }
    /**
     * Sets the feature property value. The feature property
     * @param value Value to set for the feature property.
     */
    public void setFeature(@jakarta.annotation.Nullable final FeatureType value) {
        this.feature = value;
    }
    /**
     * Sets the isSuccess property value. Indicates success or failure of the workflow.
     * @param value Value to set for the isSuccess property.
     */
    public void setIsSuccess(@jakarta.annotation.Nullable final Boolean value) {
        this.isSuccess = value;
    }
    /**
     * Sets the userDisplayName property value. User name of the user performing the reset or registration workflow.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userPrincipalName property value. User principal name of the user performing the reset or registration workflow.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
