package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ImportedDeviceIdentityResult extends ImportedDeviceIdentity implements Parsable {
    /** Status of imported device identity */
    private Boolean _status;
    /**
     * Instantiates a new ImportedDeviceIdentityResult and sets the default values.
     * @return a void
     */
    public ImportedDeviceIdentityResult() {
        super();
        this.setOdataType("#microsoft.graph.importedDeviceIdentityResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ImportedDeviceIdentityResult
     */
    @javax.annotation.Nonnull
    public static ImportedDeviceIdentityResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImportedDeviceIdentityResult();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ImportedDeviceIdentityResult currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("status", (n) -> { currentObject.setStatus(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the status property value. Status of imported device identity
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("status", this.getStatus());
    }
    /**
     * Sets the status property value. Status of imported device identity
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final Boolean value) {
        this._status = value;
    }
}
