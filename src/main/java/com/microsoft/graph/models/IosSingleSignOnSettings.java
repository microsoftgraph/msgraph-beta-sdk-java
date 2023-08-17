package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * iOS Kerberos authentication settings for single sign-on
 */
public class IosSingleSignOnSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of app identifiers that are allowed to use this login. If this field is omitted, the login applies to all applications on the device. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<AppListItem> allowedAppsList;
    /**
     * List of HTTP URLs that must be matched in order to use this login. With iOS 9.0 or later, a wildcard characters may be used.
     */
    private java.util.List<String> allowedUrls;
    /**
     * The display name of login settings shown on the receiving device.
     */
    private String displayName;
    /**
     * A Kerberos principal name. If not provided, the user is prompted for one during profile installation.
     */
    private String kerberosPrincipalName;
    /**
     * A Kerberos realm name. Case sensitive.
     */
    private String kerberosRealm;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new iosSingleSignOnSettings and sets the default values.
     */
    public IosSingleSignOnSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosSingleSignOnSettings
     */
    @jakarta.annotation.Nonnull
    public static IosSingleSignOnSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosSingleSignOnSettings();
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
     * Gets the allowedAppsList property value. List of app identifiers that are allowed to use this login. If this field is omitted, the login applies to all applications on the device. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getAllowedAppsList() {
        return this.allowedAppsList;
    }
    /**
     * Gets the allowedUrls property value. List of HTTP URLs that must be matched in order to use this login. With iOS 9.0 or later, a wildcard characters may be used.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedUrls() {
        return this.allowedUrls;
    }
    /**
     * Gets the displayName property value. The display name of login settings shown on the receiving device.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("allowedAppsList", (n) -> { this.setAllowedAppsList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("allowedUrls", (n) -> { this.setAllowedUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("kerberosPrincipalName", (n) -> { this.setKerberosPrincipalName(n.getStringValue()); });
        deserializerMap.put("kerberosRealm", (n) -> { this.setKerberosRealm(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the kerberosPrincipalName property value. A Kerberos principal name. If not provided, the user is prompted for one during profile installation.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getKerberosPrincipalName() {
        return this.kerberosPrincipalName;
    }
    /**
     * Gets the kerberosRealm property value. A Kerberos realm name. Case sensitive.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getKerberosRealm() {
        return this.kerberosRealm;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("allowedAppsList", this.getAllowedAppsList());
        writer.writeCollectionOfPrimitiveValues("allowedUrls", this.getAllowedUrls());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("kerberosPrincipalName", this.getKerberosPrincipalName());
        writer.writeStringValue("kerberosRealm", this.getKerberosRealm());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowedAppsList property value. List of app identifiers that are allowed to use this login. If this field is omitted, the login applies to all applications on the device. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the allowedAppsList property.
     */
    public void setAllowedAppsList(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.allowedAppsList = value;
    }
    /**
     * Sets the allowedUrls property value. List of HTTP URLs that must be matched in order to use this login. With iOS 9.0 or later, a wildcard characters may be used.
     * @param value Value to set for the allowedUrls property.
     */
    public void setAllowedUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.allowedUrls = value;
    }
    /**
     * Sets the displayName property value. The display name of login settings shown on the receiving device.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the kerberosPrincipalName property value. A Kerberos principal name. If not provided, the user is prompted for one during profile installation.
     * @param value Value to set for the kerberosPrincipalName property.
     */
    public void setKerberosPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.kerberosPrincipalName = value;
    }
    /**
     * Sets the kerberosRealm property value. A Kerberos realm name. Case sensitive.
     * @param value Value to set for the kerberosRealm property.
     */
    public void setKerberosRealm(@jakarta.annotation.Nullable final String value) {
        this.kerberosRealm = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
