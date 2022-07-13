package microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class QualityUpdateReference extends WindowsUpdateReference implements Parsable {
    /** Specifies the classification of the referenced content. Supports a subset of the values for qualityUpdateClassification. Possible values are: security, unknownFutureValue. */
    private QualityUpdateClassification _classification;
    /** Specifies a quality update in the given servicingChannel with the given classification by date (i.e. the last update published on the specified date). Default value is security. */
    private OffsetDateTime _releaseDateTime;
    /**
     * Instantiates a new QualityUpdateReference and sets the default values.
     * @return a void
     */
    public QualityUpdateReference() {
        super();
        this.setType("#microsoft.graph.windowsUpdates.qualityUpdateReference");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a QualityUpdateReference
     */
    @javax.annotation.Nonnull
    public static QualityUpdateReference createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsUpdates.expeditedQualityUpdateReference": return new ExpeditedQualityUpdateReference();
            }
        }
        return new QualityUpdateReference();
    }
    /**
     * Gets the classification property value. Specifies the classification of the referenced content. Supports a subset of the values for qualityUpdateClassification. Possible values are: security, unknownFutureValue.
     * @return a qualityUpdateClassification
     */
    @javax.annotation.Nullable
    public QualityUpdateClassification getClassification() {
        return this._classification;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final QualityUpdateReference currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("classification", (n) -> { currentObject.setClassification(n.getEnumValue(QualityUpdateClassification.class)); });
            this.put("releaseDateTime", (n) -> { currentObject.setReleaseDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the releaseDateTime property value. Specifies a quality update in the given servicingChannel with the given classification by date (i.e. the last update published on the specified date). Default value is security.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReleaseDateTime() {
        return this._releaseDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("classification", this.getClassification());
        writer.writeOffsetDateTimeValue("releaseDateTime", this.getReleaseDateTime());
    }
    /**
     * Sets the classification property value. Specifies the classification of the referenced content. Supports a subset of the values for qualityUpdateClassification. Possible values are: security, unknownFutureValue.
     * @param value Value to set for the classification property.
     * @return a void
     */
    public void setClassification(@javax.annotation.Nullable final QualityUpdateClassification value) {
        this._classification = value;
    }
    /**
     * Sets the releaseDateTime property value. Specifies a quality update in the given servicingChannel with the given classification by date (i.e. the last update published on the specified date). Default value is security.
     * @param value Value to set for the releaseDateTime property.
     * @return a void
     */
    public void setReleaseDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._releaseDateTime = value;
    }
}
