package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class UnitOfMeasure extends Entity implements Parsable {
    /** The code property */
    private String _code;
    /** The displayName property */
    private String _displayName;
    /** The internationalStandardCode property */
    private String _internationalStandardCode;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /**
     * Instantiates a new unitOfMeasure and sets the default values.
     * @return a void
     */
    public UnitOfMeasure() {
        super();
        this.setOdataType("#microsoft.graph.unitOfMeasure");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unitOfMeasure
     */
    @javax.annotation.Nonnull
    public static UnitOfMeasure createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnitOfMeasure();
    }
    /**
     * Gets the code property value. The code property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCode() {
        return this._code;
    }
    /**
     * Gets the displayName property value. The displayName property
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
        final UnitOfMeasure currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("code", (n) -> { currentObject.setCode(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("internationalStandardCode", (n) -> { currentObject.setInternationalStandardCode(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the internationalStandardCode property value. The internationalStandardCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInternationalStandardCode() {
        return this._internationalStandardCode;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("internationalStandardCode", this.getInternationalStandardCode());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     * @return a void
     */
    public void setCode(@javax.annotation.Nullable final String value) {
        this._code = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the internationalStandardCode property value. The internationalStandardCode property
     * @param value Value to set for the internationalStandardCode property.
     * @return a void
     */
    public void setInternationalStandardCode(@javax.annotation.Nullable final String value) {
        this._internationalStandardCode = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
}
