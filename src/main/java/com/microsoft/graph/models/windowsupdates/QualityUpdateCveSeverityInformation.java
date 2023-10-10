package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QualityUpdateCveSeverityInformation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The exploitedCves property
     */
    private java.util.List<CveInformation> exploitedCves;
    /**
     * Highest base score that occurs of any CVE addressed by the quality update. Read-only.
     */
    private Double maxBaseScore;
    /**
     * The maxSeverity property
     */
    private CveSeverityLevel maxSeverity;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new QualityUpdateCveSeverityInformation and sets the default values.
     */
    public QualityUpdateCveSeverityInformation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a QualityUpdateCveSeverityInformation
     */
    @jakarta.annotation.Nonnull
    public static QualityUpdateCveSeverityInformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QualityUpdateCveSeverityInformation();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the exploitedCves property value. The exploitedCves property
     * @return a java.util.List<CveInformation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CveInformation> getExploitedCves() {
        return this.exploitedCves;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("exploitedCves", (n) -> { this.setExploitedCves(n.getCollectionOfObjectValues(CveInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("maxBaseScore", (n) -> { this.setMaxBaseScore(n.getDoubleValue()); });
        deserializerMap.put("maxSeverity", (n) -> { this.setMaxSeverity(n.getEnumValue(CveSeverityLevel.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxBaseScore property value. Highest base score that occurs of any CVE addressed by the quality update. Read-only.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getMaxBaseScore() {
        return this.maxBaseScore;
    }
    /**
     * Gets the maxSeverity property value. The maxSeverity property
     * @return a CveSeverityLevel
     */
    @jakarta.annotation.Nullable
    public CveSeverityLevel getMaxSeverity() {
        return this.maxSeverity;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
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
        writer.writeCollectionOfObjectValues("exploitedCves", this.getExploitedCves());
        writer.writeDoubleValue("maxBaseScore", this.getMaxBaseScore());
        writer.writeEnumValue("maxSeverity", this.getMaxSeverity());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the exploitedCves property value. The exploitedCves property
     * @param value Value to set for the exploitedCves property.
     */
    public void setExploitedCves(@jakarta.annotation.Nullable final java.util.List<CveInformation> value) {
        this.exploitedCves = value;
    }
    /**
     * Sets the maxBaseScore property value. Highest base score that occurs of any CVE addressed by the quality update. Read-only.
     * @param value Value to set for the maxBaseScore property.
     */
    public void setMaxBaseScore(@jakarta.annotation.Nullable final Double value) {
        this.maxBaseScore = value;
    }
    /**
     * Sets the maxSeverity property value. The maxSeverity property
     * @param value Value to set for the maxSeverity property.
     */
    public void setMaxSeverity(@jakarta.annotation.Nullable final CveSeverityLevel value) {
        this.maxSeverity = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
