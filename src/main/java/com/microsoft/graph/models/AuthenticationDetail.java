package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new AuthenticationDetail and sets the default values.
     */
    public AuthenticationDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuthenticationDetail
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationDetail();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the authenticationMethod property value. The type of authentication method used to perform this step of authentication. Possible values: Password, SMS, Voice, Authenticator App, Software OATH token, Satisfied by token, Previously satisfied.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationMethod() {
        return this.backingStore.get("authenticationMethod");
    }
    /**
     * Gets the authenticationMethodDetail property value. Details about the authentication method used to perform this authentication step. For example, phone number (for SMS and voice), device name (for Authenticator app), and password source (for example, cloud, AD FS, PTA, PHS).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationMethodDetail() {
        return this.backingStore.get("authenticationMethodDetail");
    }
    /**
     * Gets the authenticationStepDateTime property value. Represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAuthenticationStepDateTime() {
        return this.backingStore.get("authenticationStepDateTime");
    }
    /**
     * Gets the authenticationStepRequirement property value. The step of authentication that this satisfied. For example, primary authentication, or multifactor authentication.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationStepRequirement() {
        return this.backingStore.get("authenticationStepRequirement");
    }
    /**
     * Gets the authenticationStepResultDetail property value. Details about why the step succeeded or failed. For examples, user is blocked, fraud code entered, no phone input - timed out, phone unreachable, or claim in token.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationStepResultDetail() {
        return this.backingStore.get("authenticationStepResultDetail");
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the succeeded property value. Indicates the status of the authentication step. Possible values: succeeded, failed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSucceeded() {
        return this.backingStore.get("succeeded");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the authenticationMethod property value. The type of authentication method used to perform this step of authentication. Possible values: Password, SMS, Voice, Authenticator App, Software OATH token, Satisfied by token, Previously satisfied.
     * @param value Value to set for the authenticationMethod property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("authenticationMethod", value);
    }
    /**
     * Sets the authenticationMethodDetail property value. Details about the authentication method used to perform this authentication step. For example, phone number (for SMS and voice), device name (for Authenticator app), and password source (for example, cloud, AD FS, PTA, PHS).
     * @param value Value to set for the authenticationMethodDetail property.
     */
    public void setAuthenticationMethodDetail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("authenticationMethodDetail", value);
    }
    /**
     * Sets the authenticationStepDateTime property value. Represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the authenticationStepDateTime property.
     */
    public void setAuthenticationStepDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("authenticationStepDateTime", value);
    }
    /**
     * Sets the authenticationStepRequirement property value. The step of authentication that this satisfied. For example, primary authentication, or multifactor authentication.
     * @param value Value to set for the authenticationStepRequirement property.
     */
    public void setAuthenticationStepRequirement(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("authenticationStepRequirement", value);
    }
    /**
     * Sets the authenticationStepResultDetail property value. Details about why the step succeeded or failed. For examples, user is blocked, fraud code entered, no phone input - timed out, phone unreachable, or claim in token.
     * @param value Value to set for the authenticationStepResultDetail property.
     */
    public void setAuthenticationStepResultDetail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("authenticationStepResultDetail", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the succeeded property value. Indicates the status of the authentication step. Possible values: succeeded, failed.
     * @param value Value to set for the succeeded property.
     */
    public void setSucceeded(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("succeeded", value);
    }
}
