package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The type of authentication method used to perform this step of authentication. Possible values: Password, SMS, Voice, Authenticator App, Software OATH token, Satisfied by token, Previously satisfied. */
    private String _authenticationMethod;
    /** Details about the authentication method used to perform this authentication step. For example, phone number (for SMS and voice), device name (for Authenticator app), and password source (e.g. cloud, AD FS, PTA, PHS). */
    private String _authenticationMethodDetail;
    /** Represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _authenticationStepDateTime;
    /** The step of authentication that this satisfied. For example, primary authentication, or multi-factor authentication. */
    private String _authenticationStepRequirement;
    /** Details about why the step succeeded or failed. For examples, user is blocked, fraud code entered, no phone input - timed out, phone unreachable, or claim in token. */
    private String _authenticationStepResultDetail;
    /** Indicates the status of the authentication step. Possible values: succeeded, failed. */
    private Boolean _succeeded;
    /**
     * Instantiates a new authenticationDetail and sets the default values.
     * @return a void
     */
    public AuthenticationDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationDetail
     */
    @javax.annotation.Nonnull
    public static AuthenticationDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationDetail();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the authenticationMethod property value. The type of authentication method used to perform this step of authentication. Possible values: Password, SMS, Voice, Authenticator App, Software OATH token, Satisfied by token, Previously satisfied.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticationMethod() {
        return this._authenticationMethod;
    }
    /**
     * Gets the authenticationMethodDetail property value. Details about the authentication method used to perform this authentication step. For example, phone number (for SMS and voice), device name (for Authenticator app), and password source (e.g. cloud, AD FS, PTA, PHS).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticationMethodDetail() {
        return this._authenticationMethodDetail;
    }
    /**
     * Gets the authenticationStepDateTime property value. Represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAuthenticationStepDateTime() {
        return this._authenticationStepDateTime;
    }
    /**
     * Gets the authenticationStepRequirement property value. The step of authentication that this satisfied. For example, primary authentication, or multi-factor authentication.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticationStepRequirement() {
        return this._authenticationStepRequirement;
    }
    /**
     * Gets the authenticationStepResultDetail property value. Details about why the step succeeded or failed. For examples, user is blocked, fraud code entered, no phone input - timed out, phone unreachable, or claim in token.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticationStepResultDetail() {
        return this._authenticationStepResultDetail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuthenticationDetail currentObject = this;
        return new HashMap<>(6) {{
            this.put("authenticationMethod", (n) -> { currentObject.setAuthenticationMethod(n.getStringValue()); });
            this.put("authenticationMethodDetail", (n) -> { currentObject.setAuthenticationMethodDetail(n.getStringValue()); });
            this.put("authenticationStepDateTime", (n) -> { currentObject.setAuthenticationStepDateTime(n.getOffsetDateTimeValue()); });
            this.put("authenticationStepRequirement", (n) -> { currentObject.setAuthenticationStepRequirement(n.getStringValue()); });
            this.put("authenticationStepResultDetail", (n) -> { currentObject.setAuthenticationStepResultDetail(n.getStringValue()); });
            this.put("succeeded", (n) -> { currentObject.setSucceeded(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the succeeded property value. Indicates the status of the authentication step. Possible values: succeeded, failed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSucceeded() {
        return this._succeeded;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeStringValue("authenticationMethodDetail", this.getAuthenticationMethodDetail());
        writer.writeOffsetDateTimeValue("authenticationStepDateTime", this.getAuthenticationStepDateTime());
        writer.writeStringValue("authenticationStepRequirement", this.getAuthenticationStepRequirement());
        writer.writeStringValue("authenticationStepResultDetail", this.getAuthenticationStepResultDetail());
        writer.writeBooleanValue("succeeded", this.getSucceeded());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the authenticationMethod property value. The type of authentication method used to perform this step of authentication. Possible values: Password, SMS, Voice, Authenticator App, Software OATH token, Satisfied by token, Previously satisfied.
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    public void setAuthenticationMethod(@javax.annotation.Nullable final String value) {
        this._authenticationMethod = value;
    }
    /**
     * Sets the authenticationMethodDetail property value. Details about the authentication method used to perform this authentication step. For example, phone number (for SMS and voice), device name (for Authenticator app), and password source (e.g. cloud, AD FS, PTA, PHS).
     * @param value Value to set for the authenticationMethodDetail property.
     * @return a void
     */
    public void setAuthenticationMethodDetail(@javax.annotation.Nullable final String value) {
        this._authenticationMethodDetail = value;
    }
    /**
     * Sets the authenticationStepDateTime property value. Represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the authenticationStepDateTime property.
     * @return a void
     */
    public void setAuthenticationStepDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._authenticationStepDateTime = value;
    }
    /**
     * Sets the authenticationStepRequirement property value. The step of authentication that this satisfied. For example, primary authentication, or multi-factor authentication.
     * @param value Value to set for the authenticationStepRequirement property.
     * @return a void
     */
    public void setAuthenticationStepRequirement(@javax.annotation.Nullable final String value) {
        this._authenticationStepRequirement = value;
    }
    /**
     * Sets the authenticationStepResultDetail property value. Details about why the step succeeded or failed. For examples, user is blocked, fraud code entered, no phone input - timed out, phone unreachable, or claim in token.
     * @param value Value to set for the authenticationStepResultDetail property.
     * @return a void
     */
    public void setAuthenticationStepResultDetail(@javax.annotation.Nullable final String value) {
        this._authenticationStepResultDetail = value;
    }
    /**
     * Sets the succeeded property value. Indicates the status of the authentication step. Possible values: succeeded, failed.
     * @param value Value to set for the succeeded property.
     * @return a void
     */
    public void setSucceeded(@javax.annotation.Nullable final Boolean value) {
        this._succeeded = value;
    }
}
