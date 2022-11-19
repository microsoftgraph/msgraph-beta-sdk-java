package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RedirectSingleSignOnExtension extends SingleSignOnExtension implements Parsable {
    /** Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements. */
    private java.util.List<KeyTypedValuePair> _configurations;
    /** Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs. */
    private String _extensionIdentifier;
    /** Gets or sets the team ID of the app extension that performs SSO for the specified URLs. */
    private String _teamIdentifier;
    /** One or more URL prefixes of identity providers on whose behalf the app extension performs single sign-on. URLs must begin with http:// or https://. All URL prefixes must be unique for all profiles. */
    private java.util.List<String> _urlPrefixes;
    /**
     * Instantiates a new RedirectSingleSignOnExtension and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RedirectSingleSignOnExtension() {
        super();
        this.setOdataType("#microsoft.graph.redirectSingleSignOnExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RedirectSingleSignOnExtension
     */
    @javax.annotation.Nonnull
    public static RedirectSingleSignOnExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RedirectSingleSignOnExtension();
    }
    /**
     * Gets the configurations property value. Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     * @return a keyTypedValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyTypedValuePair> getConfigurations() {
        return this._configurations;
    }
    /**
     * Gets the extensionIdentifier property value. Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExtensionIdentifier() {
        return this._extensionIdentifier;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RedirectSingleSignOnExtension currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configurations", (n) -> { currentObject.setConfigurations(n.getCollectionOfObjectValues(KeyTypedValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("extensionIdentifier", (n) -> { currentObject.setExtensionIdentifier(n.getStringValue()); });
        deserializerMap.put("teamIdentifier", (n) -> { currentObject.setTeamIdentifier(n.getStringValue()); });
        deserializerMap.put("urlPrefixes", (n) -> { currentObject.setUrlPrefixes(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap
    }
    /**
     * Gets the teamIdentifier property value. Gets or sets the team ID of the app extension that performs SSO for the specified URLs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTeamIdentifier() {
        return this._teamIdentifier;
    }
    /**
     * Gets the urlPrefixes property value. One or more URL prefixes of identity providers on whose behalf the app extension performs single sign-on. URLs must begin with http:// or https://. All URL prefixes must be unique for all profiles.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getUrlPrefixes() {
        return this._urlPrefixes;
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
        writer.writeStringValue("extensionIdentifier", this.getExtensionIdentifier());
        writer.writeStringValue("teamIdentifier", this.getTeamIdentifier());
        writer.writeCollectionOfPrimitiveValues("urlPrefixes", this.getUrlPrefixes());
    }
    /**
     * Sets the configurations property value. Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the configurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurations(@javax.annotation.Nullable final java.util.List<KeyTypedValuePair> value) {
        this._configurations = value;
    }
    /**
     * Sets the extensionIdentifier property value. Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs.
     * @param value Value to set for the extensionIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensionIdentifier(@javax.annotation.Nullable final String value) {
        this._extensionIdentifier = value;
    }
    /**
     * Sets the teamIdentifier property value. Gets or sets the team ID of the app extension that performs SSO for the specified URLs.
     * @param value Value to set for the teamIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamIdentifier(@javax.annotation.Nullable final String value) {
        this._teamIdentifier = value;
    }
    /**
     * Sets the urlPrefixes property value. One or more URL prefixes of identity providers on whose behalf the app extension performs single sign-on. URLs must begin with http:// or https://. All URL prefixes must be unique for all profiles.
     * @param value Value to set for the urlPrefixes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUrlPrefixes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._urlPrefixes = value;
    }
}
