package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosCredentialSingleSignOnExtension extends IosSingleSignOnExtension implements Parsable {
    /** Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements. */
    private java.util.List<KeyTypedValuePair> _configurations;
    /** Gets or sets a list of hosts or domain names for which the app extension performs SSO. */
    private java.util.List<String> _domains;
    /** Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs. */
    private String _extensionIdentifier;
    /** Gets or sets the case-sensitive realm name for this profile. */
    private String _realm;
    /** Gets or sets the team ID of the app extension that performs SSO for the specified URLs. */
    private String _teamIdentifier;
    /**
     * Instantiates a new IosCredentialSingleSignOnExtension and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static IosCredentialSingleSignOnExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosCredentialSingleSignOnExtension();
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
     * Gets the domains property value. Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDomains() {
        return this._domains;
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
        final IosCredentialSingleSignOnExtension currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("configurations", (n) -> { currentObject.setConfigurations(n.getCollectionOfObjectValues(KeyTypedValuePair::createFromDiscriminatorValue)); });
            this.put("domains", (n) -> { currentObject.setDomains(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("extensionIdentifier", (n) -> { currentObject.setExtensionIdentifier(n.getStringValue()); });
            this.put("realm", (n) -> { currentObject.setRealm(n.getStringValue()); });
            this.put("teamIdentifier", (n) -> { currentObject.setTeamIdentifier(n.getStringValue()); });
        }};
    }
    /**
     * Gets the realm property value. Gets or sets the case-sensitive realm name for this profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRealm() {
        return this._realm;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setConfigurations(@javax.annotation.Nullable final java.util.List<KeyTypedValuePair> value) {
        this._configurations = value;
    }
    /**
     * Sets the domains property value. Gets or sets a list of hosts or domain names for which the app extension performs SSO.
     * @param value Value to set for the domains property.
     * @return a void
     */
    public void setDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this._domains = value;
    }
    /**
     * Sets the extensionIdentifier property value. Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs.
     * @param value Value to set for the extensionIdentifier property.
     * @return a void
     */
    public void setExtensionIdentifier(@javax.annotation.Nullable final String value) {
        this._extensionIdentifier = value;
    }
    /**
     * Sets the realm property value. Gets or sets the case-sensitive realm name for this profile.
     * @param value Value to set for the realm property.
     * @return a void
     */
    public void setRealm(@javax.annotation.Nullable final String value) {
        this._realm = value;
    }
    /**
     * Sets the teamIdentifier property value. Gets or sets the team ID of the app extension that performs SSO for the specified URLs.
     * @param value Value to set for the teamIdentifier property.
     * @return a void
     */
    public void setTeamIdentifier(@javax.annotation.Nullable final String value) {
        this._teamIdentifier = value;
    }
}
