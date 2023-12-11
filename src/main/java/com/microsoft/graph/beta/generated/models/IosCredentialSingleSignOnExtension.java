package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a Credential-type Single Sign-On extension profile for iOS devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosCredentialSingleSignOnExtension extends IosSingleSignOnExtension implements Parsable {
    /**
     * Instantiates a new IosCredentialSingleSignOnExtension and sets the default values.
     */
    public IosCredentialSingleSignOnExtension() {
        super();
        this.setOdataType("#microsoft.graph.iosCredentialSingleSignOnExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosCredentialSingleSignOnExtension
     */
    @jakarta.annotation.Nonnull
    public static IosCredentialSingleSignOnExtension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosCredentialSingleSignOnExtension();
    }
    /**
     * Gets the configurations property value. Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<KeyTypedValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyTypedValuePair> getConfigurations() {
        return this.backingStore.get("configurations");
    }
    /**
     * Gets the domains property value. Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDomains() {
        return this.backingStore.get("domains");
    }
    /**
     * Gets the extensionIdentifier property value. Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExtensionIdentifier() {
        return this.backingStore.get("extensionIdentifier");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configurations", (n) -> { this.setConfigurations(n.getCollectionOfObjectValues(KeyTypedValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("domains", (n) -> { this.setDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("extensionIdentifier", (n) -> { this.setExtensionIdentifier(n.getStringValue()); });
        deserializerMap.put("realm", (n) -> { this.setRealm(n.getStringValue()); });
        deserializerMap.put("teamIdentifier", (n) -> { this.setTeamIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the realm property value. Gets or sets the case-sensitive realm name for this profile.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRealm() {
        return this.backingStore.get("realm");
    }
    /**
     * Gets the teamIdentifier property value. Gets or sets the team ID of the app extension that performs SSO for the specified URLs.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTeamIdentifier() {
        return this.backingStore.get("teamIdentifier");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("configurations", this.getConfigurations());
        writer.writeCollectionOfPrimitiveValues("domains", this.getDomains());
        writer.writeStringValue("extensionIdentifier", this.getExtensionIdentifier());
        writer.writeStringValue("realm", this.getRealm());
        writer.writeStringValue("teamIdentifier", this.getTeamIdentifier());
    }
    /**
     * Sets the configurations property value. Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the configurations property.
     */
    public void setConfigurations(@jakarta.annotation.Nullable final java.util.List<KeyTypedValuePair> value) {
        this.backingStore.set("configurations", value);
    }
    /**
     * Sets the domains property value. Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     * @param value Value to set for the domains property.
     */
    public void setDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("domains", value);
    }
    /**
     * Sets the extensionIdentifier property value. Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs.
     * @param value Value to set for the extensionIdentifier property.
     */
    public void setExtensionIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionIdentifier", value);
    }
    /**
     * Sets the realm property value. Gets or sets the case-sensitive realm name for this profile.
     * @param value Value to set for the realm property.
     */
    public void setRealm(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("realm", value);
    }
    /**
     * Sets the teamIdentifier property value. Gets or sets the team ID of the app extension that performs SSO for the specified URLs.
     * @param value Value to set for the teamIdentifier property.
     */
    public void setTeamIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("teamIdentifier", value);
    }
}
