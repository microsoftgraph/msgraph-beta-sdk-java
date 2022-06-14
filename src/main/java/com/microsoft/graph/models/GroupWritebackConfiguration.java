package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of administrativeUnit entities. */
public class GroupWritebackConfiguration extends WritebackConfiguration implements Parsable {
    /** The onPremisesGroupType property */
    private String _onPremisesGroupType;
    /**
     * Instantiates a new groupWritebackConfiguration and sets the default values.
     * @return a void
     */
    public GroupWritebackConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupWritebackConfiguration
     */
    @javax.annotation.Nonnull
    public static GroupWritebackConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupWritebackConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupWritebackConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("onPremisesGroupType", (n) -> { currentObject.setOnPremisesGroupType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the onPremisesGroupType property value. The onPremisesGroupType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesGroupType() {
        return this._onPremisesGroupType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("onPremisesGroupType", this.getOnPremisesGroupType());
    }
    /**
     * Sets the onPremisesGroupType property value. The onPremisesGroupType property
     * @param value Value to set for the onPremisesGroupType property.
     * @return a void
     */
    public void setOnPremisesGroupType(@javax.annotation.Nullable final String value) {
        this._onPremisesGroupType = value;
    }
}
