package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The type of authentication method used to perform this step of authentication. Possible values: Password, SMS, Voice, Authenticator App, Software OATH token, Satisfied by token, Previously satisfied.
     */
    private String authenticationMethod;
    /**
     * Details about the authentication method used to perform this authentication step. For example, phone number (for SMS and voice), device name (for Authenticator app), and password source (e.g. cloud, AD FS, PTA, PHS).
     */
    private String authenticationMethodDetail;
    /**
     * Represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime authenticationStepDateTime;
    /**
     * The step of authentication that this satisfied. For example, primary authentication, or multi-factor authentication.
     */
    private String authenticationStepRequirement;
    /**
     * Details about why the step succeeded or failed. For examples, user is blocked, fraud code entered, no phone input - timed out, phone unreachable, or claim in token.
     */
    private String authenticationStepResultDetail;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates the status of the authentication step. Possible values: succeeded, failed.
     */
    private Boolean succeeded;
    /**
     * Instantiates a new authenticationDetail and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AuthenticationDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationDetail
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationDetail();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the authenticationMethod property value. The type of authentication method used to perform this step of authentication. Possible values: Password, SMS, Voice, Authenticator App, Software OATH token, Satisfied by token, Previously satisfied.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationMethod() {
        return this.authenticationMethod;
    }
    /**
     * Gets the authenticationMethodDetail property value. Details about the authentication method used to perform this authentication step. For example, phone number (for SMS and voice), device name (for Authenticator app), and password source (e.g. cloud, AD FS, PTA, PHS).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationMethodDetail() {
        return this.authenticationMethodDetail;
    }
    /**
     * Gets the authenticationStepDateTime property value. Represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAuthenticationStepDateTime() {
        return this.authenticationStepDateTime;
    }
    /**
     * Gets the authenticationStepRequirement property value. The step of authentication that this satisfied. For example, primary authentication, or multi-factor authentication.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationStepRequirement() {
        return this.authenticationStepRequirement;
    }
    /**
     * Gets the authenticationStepResultDetail property value. Details about why the step succeeded or failed. For examples, user is blocked, fraud code entered, no phone input - timed out, phone unreachable, or claim in token.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationStepResultDetail() {
        return this.authenticationStepResultDetail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getStringValue()); });
        deserializerMap.put("authenticationMethodDetail", (n) -> { this.setAuthenticationMethodDetail(n.getStringValue()); });
        deserializerMap.put("authenticationStepDateTime", (n) -> { this.setAuthenticationStepDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("authenticationStepRequirement", (n) -> { this.setAuthenticationStepRequirement(n.getStringValue()); });
        deserializerMap.put("authenticationStepResultDetail", (n) -> { this.setAuthenticationStepResultDetail(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("succeeded", (n) -> { this.setSucceeded(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the succeeded property value. Indicates the status of the authentication step. Possible values: succeeded, failed.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSucceeded() {
        return this.succeeded;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeStringValue("authenticationMethodDetail", this.getAuthenticationMethodDetail());
        writer.writeOffsetDateTimeValue("authenticationStepDateTime", this.getAuthenticationStepDateTime());
        writer.writeStringValue("authenticationStepRequirement", this.getAuthenticationStepRequirement());
        writer.writeStringValue("authenticationStepResultDetail", this.getAuthenticationStepResultDetail());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("succeeded", this.getSucceeded());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the authenticationMethod property value. The type of authentication method used to perform this step of authentication. Possible values: Password, SMS, Voice, Authenticator App, Software OATH token, Satisfied by token, Previously satisfied.
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final String value) {
        this.authenticationMethod = value;
    }
    /**
     * Sets the authenticationMethodDetail property value. Details about the authentication method used to perform this authentication step. For example, phone number (for SMS and voice), device name (for Authenticator app), and password source (e.g. cloud, AD FS, PTA, PHS).
     * @param value Value to set for the authenticationMethodDetail property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAuthenticationMethodDetail(@jakarta.annotation.Nullable final String value) {
        this.authenticationMethodDetail = value;
    }
    /**
     * Sets the authenticationStepDateTime property value. Represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the authenticationStepDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAuthenticationStepDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.authenticationStepDateTime = value;
    }
    /**
     * Sets the authenticationStepRequirement property value. The step of authentication that this satisfied. For example, primary authentication, or multi-factor authentication.
     * @param value Value to set for the authenticationStepRequirement property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAuthenticationStepRequirement(@jakarta.annotation.Nullable final String value) {
        this.authenticationStepRequirement = value;
    }
    /**
     * Sets the authenticationStepResultDetail property value. Details about why the step succeeded or failed. For examples, user is blocked, fraud code entered, no phone input - timed out, phone unreachable, or claim in token.
     * @param value Value to set for the authenticationStepResultDetail property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAuthenticationStepResultDetail(@jakarta.annotation.Nullable final String value) {
        this.authenticationStepResultDetail = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the succeeded property value. Indicates the status of the authentication step. Possible values: succeeded, failed.
     * @param value Value to set for the succeeded property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSucceeded(@jakarta.annotation.Nullable final Boolean value) {
        this.succeeded = value;
    }
}
