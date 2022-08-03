package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RemoveContentFooterAction extends InformationProtectionAction implements Parsable {
    /** The uiElementNames property */
    private java.util.List<String> _uiElementNames;
    /**
     * Instantiates a new RemoveContentFooterAction and sets the default values.
     * @return a void
     */
    public RemoveContentFooterAction() {
        super();
        this.setOdataType("#microsoft.graph.security.removeContentFooterAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RemoveContentFooterAction
     */
    @javax.annotation.Nonnull
    public static RemoveContentFooterAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoveContentFooterAction();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RemoveContentFooterAction currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("uiElementNames", (n) -> { currentObject.setUiElementNames(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the uiElementNames property value. The uiElementNames property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getUiElementNames() {
        return this._uiElementNames;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("uiElementNames", this.getUiElementNames());
    }
    /**
     * Sets the uiElementNames property value. The uiElementNames property
     * @param value Value to set for the uiElementNames property.
     * @return a void
     */
    public void setUiElementNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._uiElementNames = value;
    }
}
