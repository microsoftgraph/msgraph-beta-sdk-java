package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TenantInformation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Primary domain name of an Azure AD tenant. */
    private String _defaultDomainName;
    /** Display name of an Azure AD tenant. */
    private String _displayName;
    /** Name shown to users that sign in to an Azure AD tenant. */
    private String _federationBrandName;
    /** The OdataType property */
    private String _odataType;
    /** Unique identifier of an Azure AD tenant. */
    private String _tenantId;
    /**
     * Instantiates a new tenantInformation and sets the default values.
     * @return a void
     */
    public TenantInformation() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.tenantInformation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantInformation
     */
    @javax.annotation.Nonnull
    public static TenantInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantInformation();
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
     * Gets the defaultDomainName property value. Primary domain name of an Azure AD tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultDomainName() {
        return this._defaultDomainName;
    }
    /**
     * Gets the displayName property value. Display name of an Azure AD tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the federationBrandName property value. Name shown to users that sign in to an Azure AD tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFederationBrandName() {
        return this._federationBrandName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TenantInformation currentObject = this;
        return new HashMap<>(5) {{
            this.put("defaultDomainName", (n) -> { currentObject.setDefaultDomainName(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("federationBrandName", (n) -> { currentObject.setFederationBrandName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the tenantId property value. Unique identifier of an Azure AD tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("defaultDomainName", this.getDefaultDomainName());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("federationBrandName", this.getFederationBrandName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("tenantId", this.getTenantId());
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
     * Sets the defaultDomainName property value. Primary domain name of an Azure AD tenant.
     * @param value Value to set for the defaultDomainName property.
     * @return a void
     */
    public void setDefaultDomainName(@javax.annotation.Nullable final String value) {
        this._defaultDomainName = value;
    }
    /**
     * Sets the displayName property value. Display name of an Azure AD tenant.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the federationBrandName property value. Name shown to users that sign in to an Azure AD tenant.
     * @param value Value to set for the federationBrandName property.
     * @return a void
     */
    public void setFederationBrandName(@javax.annotation.Nullable final String value) {
        this._federationBrandName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the tenantId property value. Unique identifier of an Azure AD tenant.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
