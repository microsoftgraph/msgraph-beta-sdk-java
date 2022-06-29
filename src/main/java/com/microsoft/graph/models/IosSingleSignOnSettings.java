package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** iOS Kerberos authentication settings for single sign-on */
public class IosSingleSignOnSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** List of app identifiers that are allowed to use this login. If this field is omitted, the login applies to all applications on the device. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> _allowedAppsList;
    /** List of HTTP URLs that must be matched in order to use this login. With iOS 9.0 or later, a wildcard characters may be used. */
    private java.util.List<String> _allowedUrls;
    /** The display name of login settings shown on the receiving device. */
    private String _displayName;
    /** A Kerberos principal name. If not provided, the user is prompted for one during profile installation. */
    private String _kerberosPrincipalName;
    /** A Kerberos realm name. Case sensitive. */
    private String _kerberosRealm;
    /**
     * Instantiates a new iosSingleSignOnSettings and sets the default values.
     * @return a void
     */
    public IosSingleSignOnSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosSingleSignOnSettings
     */
    @javax.annotation.Nonnull
    public static IosSingleSignOnSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosSingleSignOnSettings();
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
     * Gets the allowedAppsList property value. List of app identifiers that are allowed to use this login. If this field is omitted, the login applies to all applications on the device. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getAllowedAppsList() {
        return this._allowedAppsList;
    }
    /**
     * Gets the allowedUrls property value. List of HTTP URLs that must be matched in order to use this login. With iOS 9.0 or later, a wildcard characters may be used.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedUrls() {
        return this._allowedUrls;
    }
    /**
     * Gets the displayName property value. The display name of login settings shown on the receiving device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosSingleSignOnSettings currentObject = this;
        return new HashMap<>(5) {{
            this.put("allowedAppsList", (n) -> { currentObject.setAllowedAppsList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
            this.put("allowedUrls", (n) -> { currentObject.setAllowedUrls(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("kerberosPrincipalName", (n) -> { currentObject.setKerberosPrincipalName(n.getStringValue()); });
            this.put("kerberosRealm", (n) -> { currentObject.setKerberosRealm(n.getStringValue()); });
        }};
    }
    /**
     * Gets the kerberosPrincipalName property value. A Kerberos principal name. If not provided, the user is prompted for one during profile installation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKerberosPrincipalName() {
        return this._kerberosPrincipalName;
    }
    /**
     * Gets the kerberosRealm property value. A Kerberos realm name. Case sensitive.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKerberosRealm() {
        return this._kerberosRealm;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("allowedAppsList", this.getAllowedAppsList());
        writer.writeCollectionOfPrimitiveValues("allowedUrls", this.getAllowedUrls());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("kerberosPrincipalName", this.getKerberosPrincipalName());
        writer.writeStringValue("kerberosRealm", this.getKerberosRealm());
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
     * Sets the allowedAppsList property value. List of app identifiers that are allowed to use this login. If this field is omitted, the login applies to all applications on the device. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the allowedAppsList property.
     * @return a void
     */
    public void setAllowedAppsList(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._allowedAppsList = value;
    }
    /**
     * Sets the allowedUrls property value. List of HTTP URLs that must be matched in order to use this login. With iOS 9.0 or later, a wildcard characters may be used.
     * @param value Value to set for the allowedUrls property.
     * @return a void
     */
    public void setAllowedUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedUrls = value;
    }
    /**
     * Sets the displayName property value. The display name of login settings shown on the receiving device.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the kerberosPrincipalName property value. A Kerberos principal name. If not provided, the user is prompted for one during profile installation.
     * @param value Value to set for the kerberosPrincipalName property.
     * @return a void
     */
    public void setKerberosPrincipalName(@javax.annotation.Nullable final String value) {
        this._kerberosPrincipalName = value;
    }
    /**
     * Sets the kerberosRealm property value. A Kerberos realm name. Case sensitive.
     * @param value Value to set for the kerberosRealm property.
     * @return a void
     */
    public void setKerberosRealm(@javax.annotation.Nullable final String value) {
        this._kerberosRealm = value;
    }
}
