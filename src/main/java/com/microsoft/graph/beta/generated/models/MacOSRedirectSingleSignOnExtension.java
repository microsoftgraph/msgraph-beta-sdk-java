package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a Redirect-type Single Sign-On extension profile for macOS devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSRedirectSingleSignOnExtension extends MacOSSingleSignOnExtension implements Parsable {
    /**
     * Instantiates a new MacOSRedirectSingleSignOnExtension and sets the default values.
     */
    public MacOSRedirectSingleSignOnExtension() {
        super();
        this.setOdataType("#microsoft.graph.macOSRedirectSingleSignOnExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSRedirectSingleSignOnExtension
     */
    @jakarta.annotation.Nonnull
    public static MacOSRedirectSingleSignOnExtension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSRedirectSingleSignOnExtension();
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
        deserializerMap.put("extensionIdentifier", (n) -> { this.setExtensionIdentifier(n.getStringValue()); });
        deserializerMap.put("teamIdentifier", (n) -> { this.setTeamIdentifier(n.getStringValue()); });
        deserializerMap.put("urlPrefixes", (n) -> { this.setUrlPrefixes(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
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
     * Gets the urlPrefixes property value. One or more URL prefixes of identity providers on whose behalf the app extension performs single sign-on. URLs must begin with http:// or https://. All URL prefixes must be unique for all profiles.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUrlPrefixes() {
        return this.backingStore.get("urlPrefixes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("configurations", this.getConfigurations());
        writer.writeStringValue("extensionIdentifier", this.getExtensionIdentifier());
        writer.writeStringValue("teamIdentifier", this.getTeamIdentifier());
        writer.writeCollectionOfPrimitiveValues("urlPrefixes", this.getUrlPrefixes());
    }
    /**
     * Sets the configurations property value. Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the configurations property.
     */
    public void setConfigurations(@jakarta.annotation.Nullable final java.util.List<KeyTypedValuePair> value) {
        this.backingStore.set("configurations", value);
    }
    /**
     * Sets the extensionIdentifier property value. Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs.
     * @param value Value to set for the extensionIdentifier property.
     */
    public void setExtensionIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("extensionIdentifier", value);
    }
    /**
     * Sets the teamIdentifier property value. Gets or sets the team ID of the app extension that performs SSO for the specified URLs.
     * @param value Value to set for the teamIdentifier property.
     */
    public void setTeamIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("teamIdentifier", value);
    }
    /**
     * Sets the urlPrefixes property value. One or more URL prefixes of identity providers on whose behalf the app extension performs single sign-on. URLs must begin with http:// or https://. All URL prefixes must be unique for all profiles.
     * @param value Value to set for the urlPrefixes property.
     */
    public void setUrlPrefixes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("urlPrefixes", value);
    }
}
