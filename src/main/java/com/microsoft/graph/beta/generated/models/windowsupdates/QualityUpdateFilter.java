package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QualityUpdateFilter extends WindowsUpdateFilter implements Parsable {
    /**
     * Instantiates a new {@link QualityUpdateFilter} and sets the default values.
     */
    public QualityUpdateFilter() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.qualityUpdateFilter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link QualityUpdateFilter}
     */
    @jakarta.annotation.Nonnull
    public static QualityUpdateFilter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new QualityUpdateFilter();
    }
    /**
     * Gets the cadence property value. Specifies the cadence for publishing quality updates of the filter. The possible values are: monthly, outOfBand, unknownFutureValue.
     * @return a {@link QualityUpdateCadence}
     */
    @jakarta.annotation.Nullable
    public QualityUpdateCadence getCadence() {
        return this.backingStore.get("cadence");
    }
    /**
     * Gets the classification property value. Specifies the quality update classification of the filter. The possible values are: all, security, nonSecurity, unknownFutureValue.
     * @return a {@link QualityUpdateClassification}
     */
    @jakarta.annotation.Nullable
    public QualityUpdateClassification getClassification() {
        return this.backingStore.get("classification");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cadence", (n) -> { this.setCadence(n.getEnumValue(QualityUpdateCadence::forValue)); });
        deserializerMap.put("classification", (n) -> { this.setClassification(n.getEnumValue(QualityUpdateClassification::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("cadence", this.getCadence());
        writer.writeEnumValue("classification", this.getClassification());
    }
    /**
     * Sets the cadence property value. Specifies the cadence for publishing quality updates of the filter. The possible values are: monthly, outOfBand, unknownFutureValue.
     * @param value Value to set for the cadence property.
     */
    public void setCadence(@jakarta.annotation.Nullable final QualityUpdateCadence value) {
        this.backingStore.set("cadence", value);
    }
    /**
     * Sets the classification property value. Specifies the quality update classification of the filter. The possible values are: all, security, nonSecurity, unknownFutureValue.
     * @param value Value to set for the classification property.
     */
    public void setClassification(@jakarta.annotation.Nullable final QualityUpdateClassification value) {
        this.backingStore.set("classification", value);
    }
}
