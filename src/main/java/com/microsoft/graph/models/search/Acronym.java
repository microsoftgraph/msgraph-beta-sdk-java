package microsoft.graph.models.search;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Acronym extends SearchAnswer implements Parsable {
    /** What the acronym stands for. */
    private String _standsFor;
    /** The state property */
    private AnswerState _state;
    /**
     * Instantiates a new Acronym and sets the default values.
     * @return a void
     */
    public Acronym() {
        super();
        this.setOdataType("#microsoft.graph.search.acronym");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Acronym
     */
    @javax.annotation.Nonnull
    public static Acronym createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Acronym();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Acronym currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("standsFor", (n) -> { currentObject.setStandsFor(n.getStringValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(AnswerState.class)); });
        }};
    }
    /**
     * Gets the standsFor property value. What the acronym stands for.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStandsFor() {
        return this._standsFor;
    }
    /**
     * Gets the state property value. The state property
     * @return a answerState
     */
    @javax.annotation.Nullable
    public AnswerState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("standsFor", this.getStandsFor());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the standsFor property value. What the acronym stands for.
     * @param value Value to set for the standsFor property.
     * @return a void
     */
    public void setStandsFor(@javax.annotation.Nullable final String value) {
        this._standsFor = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final AnswerState value) {
        this._state = value;
    }
}
