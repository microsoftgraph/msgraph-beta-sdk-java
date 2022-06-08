package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Casts the previous resource to group. */
public class PersonAnnualEvent extends ItemFacet implements Parsable {
    /** The date property */
    private LocalDate _date;
    /** The displayName property */
    private String _displayName;
    /** The type property */
    private PersonAnnualEventType _type;
    /**
     * Instantiates a new personAnnualEvent and sets the default values.
     * @return a void
     */
    public PersonAnnualEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a personAnnualEvent
     */
    @javax.annotation.Nonnull
    public static PersonAnnualEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonAnnualEvent();
    }
    /**
     * Gets the date property value. The date property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getDate() {
        return this._date;
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
        final PersonAnnualEvent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("date", (n) -> { currentObject.setDate(n.getLocalDateValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(PersonAnnualEventType.class)); });
        }};
    }
    /**
     * Gets the type property value. The type property
     * @return a personAnnualEventType
     */
    @javax.annotation.Nullable
    public PersonAnnualEventType getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLocalDateValue("date", this.getDate());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the date property value. The date property
     * @param value Value to set for the date property.
     * @return a void
     */
    public void setDate(@javax.annotation.Nullable final LocalDate value) {
        this._date = value;
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
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final PersonAnnualEventType value) {
        this._type = value;
    }
}
