package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class UserCredentialUsageDetails extends Entity implements Parsable {
    /** The authMethod property */
    private UsageAuthMethod _authMethod;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _eventDateTime;
    /** Provides the failure reason for the corresponding reset or registration workflow. */
    private String _failureReason;
    /** The feature property */
    private FeatureType _feature;
    /** Indicates success or failure of the workflow. */
    private Boolean _isSuccess;
    /** User name of the user performing the reset or registration workflow. */
    private String _userDisplayName;
    /** User principal name of the user performing the reset or registration workflow. */
    private String _userPrincipalName;
    /**
     * Instantiates a new userCredentialUsageDetails and sets the default values.
     * @return a void
     */
    public UserCredentialUsageDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userCredentialUsageDetails
     */
    @javax.annotation.Nonnull
    public static UserCredentialUsageDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserCredentialUsageDetails();
    }
    /**
     * Gets the authMethod property value. The authMethod property
     * @return a usageAuthMethod
     */
    @javax.annotation.Nullable
    public UsageAuthMethod getAuthMethod() {
        return this._authMethod;
    }
    /**
     * Gets the eventDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this._eventDateTime;
    }
    /**
     * Gets the failureReason property value. Provides the failure reason for the corresponding reset or registration workflow.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFailureReason() {
        return this._failureReason;
    }
    /**
     * Gets the feature property value. The feature property
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
        final UserCredentialUsageDetails currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authMethod", (n) -> { currentObject.setAuthMethod(n.getEnumValue(UsageAuthMethod.class)); });
            this.put("eventDateTime", (n) -> { currentObject.setEventDateTime(n.getOffsetDateTimeValue()); });
            this.put("failureReason", (n) -> { currentObject.setFailureReason(n.getStringValue()); });
            this.put("feature", (n) -> { currentObject.setFeature(n.getEnumValue(FeatureType.class)); });
            this.put("isSuccess", (n) -> { currentObject.setIsSuccess(n.getBooleanValue()); });
            this.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isSuccess property value. Indicates success or failure of the workflow.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSuccess() {
        return this._isSuccess;
    }
    /**
     * Gets the userDisplayName property value. User name of the user performing the reset or registration workflow.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
    }
    /**
     * Gets the userPrincipalName property value. User principal name of the user performing the reset or registration workflow.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
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
     * @return a void
     */
    public void setAuthMethod(@javax.annotation.Nullable final UsageAuthMethod value) {
        this._authMethod = value;
    }
    /**
     * Sets the eventDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the eventDateTime property.
     * @return a void
     */
    public void setEventDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._eventDateTime = value;
    }
    /**
     * Sets the failureReason property value. Provides the failure reason for the corresponding reset or registration workflow.
     * @param value Value to set for the failureReason property.
     * @return a void
     */
    public void setFailureReason(@javax.annotation.Nullable final String value) {
        this._failureReason = value;
    }
    /**
     * Sets the feature property value. The feature property
     * @param value Value to set for the feature property.
     * @return a void
     */
    public void setFeature(@javax.annotation.Nullable final FeatureType value) {
        this._feature = value;
    }
    /**
     * Sets the isSuccess property value. Indicates success or failure of the workflow.
     * @param value Value to set for the isSuccess property.
     * @return a void
     */
    public void setIsSuccess(@javax.annotation.Nullable final Boolean value) {
        this._isSuccess = value;
    }
    /**
     * Sets the userDisplayName property value. User name of the user performing the reset or registration workflow.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userPrincipalName property value. User principal name of the user performing the reset or registration workflow.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
