package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CommsApplication implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The calls property  */
    private java.util.List<Call> _calls;
    /** The onlineMeetings property  */
    private java.util.List<OnlineMeeting> _onlineMeetings;
    /**
     * Instantiates a new CommsApplication and sets the default values.
     * @return a void
     */
    public CommsApplication() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CommsApplication
     */
    @javax.annotation.Nonnull
    public static CommsApplication createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CommsApplication();
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
     * Gets the calls property value. The calls property
     * @return a call
     */
    @javax.annotation.Nullable
    public java.util.List<Call> getCalls() {
        return this._calls;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CommsApplication currentObject = this;
        return new HashMap<>(2) {{
            this.put("calls", (n) -> { currentObject.setCalls(n.getCollectionOfObjectValues(Call::createFromDiscriminatorValue)); });
            this.put("onlineMeetings", (n) -> { currentObject.setOnlineMeetings(n.getCollectionOfObjectValues(OnlineMeeting::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the onlineMeetings property value. The onlineMeetings property
     * @return a onlineMeeting
     */
    @javax.annotation.Nullable
    public java.util.List<OnlineMeeting> getOnlineMeetings() {
        return this._onlineMeetings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("calls", this.getCalls());
        writer.writeCollectionOfObjectValues("onlineMeetings", this.getOnlineMeetings());
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
     * Sets the calls property value. The calls property
     * @param value Value to set for the calls property.
     * @return a void
     */
    public void setCalls(@javax.annotation.Nullable final java.util.List<Call> value) {
        this._calls = value;
    }
    /**
     * Sets the onlineMeetings property value. The onlineMeetings property
     * @param value Value to set for the onlineMeetings property.
     * @return a void
     */
    public void setOnlineMeetings(@javax.annotation.Nullable final java.util.List<OnlineMeeting> value) {
        this._onlineMeetings = value;
    }
}
