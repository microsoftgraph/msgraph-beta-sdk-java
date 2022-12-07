package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A configuration entity for MEM features that utilize Data Processor Service for Windows (DPSW) data. */
public class DataProcessorServiceForWindowsFeaturesOnboarding implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether the tenant has enabled MEM features utilizing Data Processor Service for Windows (DPSW) data. When TRUE, the tenant has enabled MEM features utilizing Data Processor Service for Windows (DPSW) data. When FALSE, the tenant has not enabled MEM features utilizing Data Processor Service for Windows (DPSW) data. Default value is FALSE. */
    private Boolean _areDataProcessorServiceForWindowsFeaturesEnabled;
    /** Indicates whether the tenant has required Windows license. When TRUE, the tenant has the required Windows license. When FALSE, the tenant does not have the required Windows license. Default value is FALSE. */
    private Boolean _hasValidWindowsLicense;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new dataProcessorServiceForWindowsFeaturesOnboarding and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DataProcessorServiceForWindowsFeaturesOnboarding() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a dataProcessorServiceForWindowsFeaturesOnboarding
     */
    @javax.annotation.Nonnull
    public static DataProcessorServiceForWindowsFeaturesOnboarding createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DataProcessorServiceForWindowsFeaturesOnboarding();
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
     * Gets the areDataProcessorServiceForWindowsFeaturesEnabled property value. Indicates whether the tenant has enabled MEM features utilizing Data Processor Service for Windows (DPSW) data. When TRUE, the tenant has enabled MEM features utilizing Data Processor Service for Windows (DPSW) data. When FALSE, the tenant has not enabled MEM features utilizing Data Processor Service for Windows (DPSW) data. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAreDataProcessorServiceForWindowsFeaturesEnabled() {
        return this._areDataProcessorServiceForWindowsFeaturesEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("areDataProcessorServiceForWindowsFeaturesEnabled", (n) -> { this.setAreDataProcessorServiceForWindowsFeaturesEnabled(n.getBooleanValue()); });
        deserializerMap.put("hasValidWindowsLicense", (n) -> { this.setHasValidWindowsLicense(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasValidWindowsLicense property value. Indicates whether the tenant has required Windows license. When TRUE, the tenant has the required Windows license. When FALSE, the tenant does not have the required Windows license. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasValidWindowsLicense() {
        return this._hasValidWindowsLicense;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("areDataProcessorServiceForWindowsFeaturesEnabled", this.getAreDataProcessorServiceForWindowsFeaturesEnabled());
        writer.writeBooleanValue("hasValidWindowsLicense", this.getHasValidWindowsLicense());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the areDataProcessorServiceForWindowsFeaturesEnabled property value. Indicates whether the tenant has enabled MEM features utilizing Data Processor Service for Windows (DPSW) data. When TRUE, the tenant has enabled MEM features utilizing Data Processor Service for Windows (DPSW) data. When FALSE, the tenant has not enabled MEM features utilizing Data Processor Service for Windows (DPSW) data. Default value is FALSE.
     * @param value Value to set for the areDataProcessorServiceForWindowsFeaturesEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAreDataProcessorServiceForWindowsFeaturesEnabled(@javax.annotation.Nullable final Boolean value) {
        this._areDataProcessorServiceForWindowsFeaturesEnabled = value;
    }
    /**
     * Sets the hasValidWindowsLicense property value. Indicates whether the tenant has required Windows license. When TRUE, the tenant has the required Windows license. When FALSE, the tenant does not have the required Windows license. Default value is FALSE.
     * @param value Value to set for the hasValidWindowsLicense property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasValidWindowsLicense(@javax.annotation.Nullable final Boolean value) {
        this._hasValidWindowsLicense = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
