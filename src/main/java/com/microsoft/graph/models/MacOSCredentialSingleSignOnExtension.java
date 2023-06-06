package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSCredentialSingleSignOnExtension extends MacOSSingleSignOnExtension implements Parsable {
    /** Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements. */
    private java.util.List<KeyTypedValuePair> configurations;
    /** Gets or sets a list of hosts or domain names for which the app extension performs SSO. */
    private java.util.List<String> domains;
    /** Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs. */
    private String extensionIdentifier;
    /** Gets or sets the case-sensitive realm name for this profile. */
    private String realm;
    /** Gets or sets the team ID of the app extension that performs SSO for the specified URLs. */
    private String teamIdentifier;
    /**
     * Instantiates a new MacOSCredentialSingleSignOnExtension and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSCredentialSingleSignOnExtension() {
        super();
        this.setOdataType("#microsoft.graph.macOSCredentialSingleSignOnExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSCredentialSingleSignOnExtension
     */
    @javax.annotation.Nonnull
    public static MacOSCredentialSingleSignOnExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSCredentialSingleSignOnExtension();
    }
    /**
     * Gets the configurations property value. Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     * @return a keyTypedValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyTypedValuePair> getConfigurations() {
        return this.configurations;
    }
    /**
     * Gets the domains property value. Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDomains() {
        return this.domains;
    }
    /**
     * Gets the extensionIdentifier property value. Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionIdentifier() {
        return this.extensionIdentifier;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRealm() {
        return this.realm;
    }
    /**
     * Gets the teamIdentifier property value. Gets or sets the team ID of the app extension that performs SSO for the specified URLs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamIdentifier() {
        return this.teamIdentifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurations(@javax.annotation.Nullable final java.util.List<KeyTypedValuePair> value) {
        this.configurations = value;
    }
    /**
     * Sets the domains property value. Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     * @param value Value to set for the domains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this.domains = value;
    }
    /**
     * Sets the extensionIdentifier property value. Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs.
     * @param value Value to set for the extensionIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensionIdentifier(@javax.annotation.Nullable final String value) {
        this.extensionIdentifier = value;
    }
    /**
     * Sets the realm property value. Gets or sets the case-sensitive realm name for this profile.
     * @param value Value to set for the realm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRealm(@javax.annotation.Nullable final String value) {
        this.realm = value;
    }
    /**
     * Sets the teamIdentifier property value. Gets or sets the team ID of the app extension that performs SSO for the specified URLs.
     * @param value Value to set for the teamIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamIdentifier(@javax.annotation.Nullable final String value) {
        this.teamIdentifier = value;
    }
}
