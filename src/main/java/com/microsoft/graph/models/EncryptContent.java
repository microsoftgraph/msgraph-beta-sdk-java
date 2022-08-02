package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EncryptContent extends LabelActionBase implements Parsable {
    /** The encryptWith property */
    private EncryptWith _encryptWith;
    /**
     * Instantiates a new EncryptContent and sets the default values.
     * @return a void
     */
    public EncryptContent() {
        super();
        this.setOdataType("#microsoft.graph.encryptContent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EncryptContent
     */
    @javax.annotation.Nonnull
    public static EncryptContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.encryptWithTemplate": return new EncryptWithTemplate();
                case "#microsoft.graph.encryptWithUserDefinedRights": return new EncryptWithUserDefinedRights();
            }
        }
        return new EncryptContent();
    }
    /**
     * Gets the encryptWith property value. The encryptWith property
     * @return a encryptWith
     */
    @javax.annotation.Nullable
    public EncryptWith getEncryptWith() {
        return this._encryptWith;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EncryptContent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("encryptWith", (n) -> { currentObject.setEncryptWith(n.getEnumValue(EncryptWith.class)); });
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
        writer.writeEnumValue("encryptWith", this.getEncryptWith());
    }
    /**
     * Sets the encryptWith property value. The encryptWith property
     * @param value Value to set for the encryptWith property.
     * @return a void
     */
    public void setEncryptWith(@javax.annotation.Nullable final EncryptWith value) {
        this._encryptWith = value;
    }
}
