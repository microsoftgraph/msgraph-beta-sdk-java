package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class UserConfiguration extends Entity implements Parsable {
    /** The binaryData property */
    private byte[] _binaryData;
    /**
     * Instantiates a new userConfiguration and sets the default values.
     * @return a void
     */
    public UserConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.userConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userConfiguration
     */
    @javax.annotation.Nonnull
    public static UserConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserConfiguration();
    }
    /**
     * Gets the binaryData property value. The binaryData property
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getBinaryData() {
        return this._binaryData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("binaryData", (n) -> { currentObject.setBinaryData(n.getByteArrayValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("binaryData", this.getBinaryData());
    }
    /**
     * Sets the binaryData property value. The binaryData property
     * @param value Value to set for the binaryData property.
     * @return a void
     */
    public void setBinaryData(@javax.annotation.Nullable final byte[] value) {
        this._binaryData = value;
    }
}
