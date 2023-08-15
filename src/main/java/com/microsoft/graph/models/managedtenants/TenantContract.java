package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TenantContract implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The type of relationship that exists between the managing entity and tenant. Optional. Read-only.
     */
    private Integer contractType;
    /**
     * The default domain name for the tenant. Required. Read-only.
     */
    private String defaultDomainName;
    /**
     * The display name for the tenant. Optional. Read-only.
     */
    private String displayName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new tenantContract and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public TenantContract() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantContract
     */
    @jakarta.annotation.Nonnull
    public static TenantContract createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantContract();
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
     * Gets the contractType property value. The type of relationship that exists between the managing entity and tenant. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getContractType() {
        return this.contractType;
    }
    /**
     * Gets the defaultDomainName property value. The default domain name for the tenant. Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDefaultDomainName() {
        return this.defaultDomainName;
    }
    /**
     * Gets the displayName property value. The display name for the tenant. Optional. Read-only.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("contractType", (n) -> { this.setContractType(n.getIntegerValue()); });
        deserializerMap.put("defaultDomainName", (n) -> { this.setDefaultDomainName(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("contractType", this.getContractType());
        writer.writeStringValue("defaultDomainName", this.getDefaultDomainName());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the contractType property value. The type of relationship that exists between the managing entity and tenant. Optional. Read-only.
     * @param value Value to set for the contractType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setContractType(@jakarta.annotation.Nullable final Integer value) {
        this.contractType = value;
    }
    /**
     * Sets the defaultDomainName property value. The default domain name for the tenant. Required. Read-only.
     * @param value Value to set for the defaultDomainName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDefaultDomainName(@jakarta.annotation.Nullable final String value) {
        this.defaultDomainName = value;
    }
    /**
     * Sets the displayName property value. The display name for the tenant. Optional. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
