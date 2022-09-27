package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SecurityProviderStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The enabled property */
    private Boolean _enabled;
    /** The endpoint property */
    private String _endpoint;
    /** The OdataType property */
    private String _odataType;
    /** The provider property */
    private String _provider;
    /** The region property */
    private String _region;
    /** The vendor property */
    private String _vendor;
    /**
     * Instantiates a new securityProviderStatus and sets the default values.
     * @return a void
     */
    public SecurityProviderStatus() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.securityProviderStatus");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityProviderStatus
     */
    @javax.annotation.Nonnull
    public static SecurityProviderStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityProviderStatus();
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
     * Gets the enabled property value. The enabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this._enabled;
    }
    /**
     * Gets the endpoint property value. The endpoint property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEndpoint() {
        return this._endpoint;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SecurityProviderStatus currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("enabled", (n) -> { currentObject.setEnabled(n.getBooleanValue()); });
            this.put("endpoint", (n) -> { currentObject.setEndpoint(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("provider", (n) -> { currentObject.setProvider(n.getStringValue()); });
            this.put("region", (n) -> { currentObject.setRegion(n.getStringValue()); });
            this.put("vendor", (n) -> { currentObject.setVendor(n.getStringValue()); });
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
     * Gets the provider property value. The provider property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProvider() {
        return this._provider;
    }
    /**
     * Gets the region property value. The region property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegion() {
        return this._region;
    }
    /**
     * Gets the vendor property value. The vendor property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVendor() {
        return this._vendor;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("endpoint", this.getEndpoint());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("provider", this.getProvider());
        writer.writeStringValue("region", this.getRegion());
        writer.writeStringValue("vendor", this.getVendor());
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
     * Sets the enabled property value. The enabled property
     * @param value Value to set for the enabled property.
     * @return a void
     */
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this._enabled = value;
    }
    /**
     * Sets the endpoint property value. The endpoint property
     * @param value Value to set for the endpoint property.
     * @return a void
     */
    public void setEndpoint(@javax.annotation.Nullable final String value) {
        this._endpoint = value;
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
     * Sets the provider property value. The provider property
     * @param value Value to set for the provider property.
     * @return a void
     */
    public void setProvider(@javax.annotation.Nullable final String value) {
        this._provider = value;
    }
    /**
     * Sets the region property value. The region property
     * @param value Value to set for the region property.
     * @return a void
     */
    public void setRegion(@javax.annotation.Nullable final String value) {
        this._region = value;
    }
    /**
     * Sets the vendor property value. The vendor property
     * @param value Value to set for the vendor property.
     * @return a void
     */
    public void setVendor(@javax.annotation.Nullable final String value) {
        this._vendor = value;
    }
}
