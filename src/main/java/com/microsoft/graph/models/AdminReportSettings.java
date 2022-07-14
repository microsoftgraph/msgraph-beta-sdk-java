package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AdminReportSettings extends Entity implements Parsable {
    /** The displayConcealedNames property */
    private Boolean _displayConcealedNames;
    /**
     * Instantiates a new adminReportSettings and sets the default values.
     * @return a void
     */
    public AdminReportSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a adminReportSettings
     */
    @javax.annotation.Nonnull
    public static AdminReportSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminReportSettings();
    }
    /**
     * Gets the displayConcealedNames property value. The displayConcealedNames property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisplayConcealedNames() {
        return this._displayConcealedNames;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AdminReportSettings currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayConcealedNames", (n) -> { currentObject.setDisplayConcealedNames(n.getBooleanValue()); });
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
        writer.writeBooleanValue("displayConcealedNames", this.getDisplayConcealedNames());
    }
    /**
     * Sets the displayConcealedNames property value. The displayConcealedNames property
     * @param value Value to set for the displayConcealedNames property.
     * @return a void
     */
    public void setDisplayConcealedNames(@javax.annotation.Nullable final Boolean value) {
        this._displayConcealedNames = value;
    }
}
