package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CommunicationsApplicationIdentity extends Identity implements Parsable {
    /** The applicationType property */
    private String _applicationType;
    /** The hidden property */
    private Boolean _hidden;
    /**
     * Instantiates a new CommunicationsApplicationIdentity and sets the default values.
     * @return a void
     */
    public CommunicationsApplicationIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CommunicationsApplicationIdentity
     */
    @javax.annotation.Nonnull
    public static CommunicationsApplicationIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CommunicationsApplicationIdentity();
    }
    /**
     * Gets the applicationType property value. The applicationType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationType() {
        return this._applicationType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CommunicationsApplicationIdentity currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applicationType", (n) -> { currentObject.setApplicationType(n.getStringValue()); });
            this.put("hidden", (n) -> { currentObject.setHidden(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the hidden property value. The hidden property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHidden() {
        return this._hidden;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("applicationType", this.getApplicationType());
        writer.writeBooleanValue("hidden", this.getHidden());
    }
    /**
     * Sets the applicationType property value. The applicationType property
     * @param value Value to set for the applicationType property.
     * @return a void
     */
    public void setApplicationType(@javax.annotation.Nullable final String value) {
        this._applicationType = value;
    }
    /**
     * Sets the hidden property value. The hidden property
     * @param value Value to set for the hidden property.
     * @return a void
     */
    public void setHidden(@javax.annotation.Nullable final Boolean value) {
        this._hidden = value;
    }
}
