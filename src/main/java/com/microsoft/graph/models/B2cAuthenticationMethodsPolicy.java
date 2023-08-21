package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class B2cAuthenticationMethodsPolicy extends Entity implements Parsable {
    /**
     * The tenant admin can configure local accounts using email if the email and password authentication method is enabled.
     */
    private Boolean isEmailPasswordAuthenticationEnabled;
    /**
     * The tenant admin can configure local accounts using phone number if the phone number and one-time password authentication method is enabled.
     */
    private Boolean isPhoneOneTimePasswordAuthenticationEnabled;
    /**
     * The tenant admin can configure local accounts using username if the username and password authentication method is enabled.
     */
    private Boolean isUserNameAuthenticationEnabled;
    /**
     * Instantiates a new b2cAuthenticationMethodsPolicy and sets the default values.
     */
    public B2cAuthenticationMethodsPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a b2cAuthenticationMethodsPolicy
     */
    @jakarta.annotation.Nonnull
    public static B2cAuthenticationMethodsPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new B2cAuthenticationMethodsPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isEmailPasswordAuthenticationEnabled", (n) -> { this.setIsEmailPasswordAuthenticationEnabled(n.getBooleanValue()); });
        deserializerMap.put("isPhoneOneTimePasswordAuthenticationEnabled", (n) -> { this.setIsPhoneOneTimePasswordAuthenticationEnabled(n.getBooleanValue()); });
        deserializerMap.put("isUserNameAuthenticationEnabled", (n) -> { this.setIsUserNameAuthenticationEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEmailPasswordAuthenticationEnabled property value. The tenant admin can configure local accounts using email if the email and password authentication method is enabled.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEmailPasswordAuthenticationEnabled() {
        return this.isEmailPasswordAuthenticationEnabled;
    }
    /**
     * Gets the isPhoneOneTimePasswordAuthenticationEnabled property value. The tenant admin can configure local accounts using phone number if the phone number and one-time password authentication method is enabled.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPhoneOneTimePasswordAuthenticationEnabled() {
        return this.isPhoneOneTimePasswordAuthenticationEnabled;
    }
    /**
     * Gets the isUserNameAuthenticationEnabled property value. The tenant admin can configure local accounts using username if the username and password authentication method is enabled.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsUserNameAuthenticationEnabled() {
        return this.isUserNameAuthenticationEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isEmailPasswordAuthenticationEnabled", this.getIsEmailPasswordAuthenticationEnabled());
        writer.writeBooleanValue("isPhoneOneTimePasswordAuthenticationEnabled", this.getIsPhoneOneTimePasswordAuthenticationEnabled());
        writer.writeBooleanValue("isUserNameAuthenticationEnabled", this.getIsUserNameAuthenticationEnabled());
    }
    /**
     * Sets the isEmailPasswordAuthenticationEnabled property value. The tenant admin can configure local accounts using email if the email and password authentication method is enabled.
     * @param value Value to set for the isEmailPasswordAuthenticationEnabled property.
     */
    public void setIsEmailPasswordAuthenticationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isEmailPasswordAuthenticationEnabled = value;
    }
    /**
     * Sets the isPhoneOneTimePasswordAuthenticationEnabled property value. The tenant admin can configure local accounts using phone number if the phone number and one-time password authentication method is enabled.
     * @param value Value to set for the isPhoneOneTimePasswordAuthenticationEnabled property.
     */
    public void setIsPhoneOneTimePasswordAuthenticationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isPhoneOneTimePasswordAuthenticationEnabled = value;
    }
    /**
     * Sets the isUserNameAuthenticationEnabled property value. The tenant admin can configure local accounts using username if the username and password authentication method is enabled.
     * @param value Value to set for the isUserNameAuthenticationEnabled property.
     */
    public void setIsUserNameAuthenticationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isUserNameAuthenticationEnabled = value;
    }
}
