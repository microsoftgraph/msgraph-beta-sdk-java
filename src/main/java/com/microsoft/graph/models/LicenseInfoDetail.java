package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LicenseInfoDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The licenseType property */
    private AzureADLicenseType _licenseType;
    /** The OdataType property */
    private String _odataType;
    /** The totalAssignedCount property */
    private Integer _totalAssignedCount;
    /** The totalLicenseCount property */
    private Integer _totalLicenseCount;
    /** The totalUsageCount property */
    private Integer _totalUsageCount;
    /**
     * Instantiates a new licenseInfoDetail and sets the default values.
     * @return a void
     */
    public LicenseInfoDetail() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.licenseInfoDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a licenseInfoDetail
     */
    @javax.annotation.Nonnull
    public static LicenseInfoDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LicenseInfoDetail();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LicenseInfoDetail currentObject = this;
        return new HashMap<>(5) {{
            this.put("licenseType", (n) -> { currentObject.setLicenseType(n.getEnumValue(AzureADLicenseType.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("totalAssignedCount", (n) -> { currentObject.setTotalAssignedCount(n.getIntegerValue()); });
            this.put("totalLicenseCount", (n) -> { currentObject.setTotalLicenseCount(n.getIntegerValue()); });
            this.put("totalUsageCount", (n) -> { currentObject.setTotalUsageCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the licenseType property value. The licenseType property
     * @return a azureADLicenseType
     */
    @javax.annotation.Nullable
    public AzureADLicenseType getLicenseType() {
        return this._licenseType;
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
     * Gets the totalAssignedCount property value. The totalAssignedCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalAssignedCount() {
        return this._totalAssignedCount;
    }
    /**
     * Gets the totalLicenseCount property value. The totalLicenseCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalLicenseCount() {
        return this._totalLicenseCount;
    }
    /**
     * Gets the totalUsageCount property value. The totalUsageCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalUsageCount() {
        return this._totalUsageCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("licenseType", this.getLicenseType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("totalAssignedCount", this.getTotalAssignedCount());
        writer.writeIntegerValue("totalLicenseCount", this.getTotalLicenseCount());
        writer.writeIntegerValue("totalUsageCount", this.getTotalUsageCount());
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
     * Sets the licenseType property value. The licenseType property
     * @param value Value to set for the licenseType property.
     * @return a void
     */
    public void setLicenseType(@javax.annotation.Nullable final AzureADLicenseType value) {
        this._licenseType = value;
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
     * Sets the totalAssignedCount property value. The totalAssignedCount property
     * @param value Value to set for the totalAssignedCount property.
     * @return a void
     */
    public void setTotalAssignedCount(@javax.annotation.Nullable final Integer value) {
        this._totalAssignedCount = value;
    }
    /**
     * Sets the totalLicenseCount property value. The totalLicenseCount property
     * @param value Value to set for the totalLicenseCount property.
     * @return a void
     */
    public void setTotalLicenseCount(@javax.annotation.Nullable final Integer value) {
        this._totalLicenseCount = value;
    }
    /**
     * Sets the totalUsageCount property value. The totalUsageCount property
     * @param value Value to set for the totalUsageCount property.
     * @return a void
     */
    public void setTotalUsageCount(@javax.annotation.Nullable final Integer value) {
        this._totalUsageCount = value;
    }
}
