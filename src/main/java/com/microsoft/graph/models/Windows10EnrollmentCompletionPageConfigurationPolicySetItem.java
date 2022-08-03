package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10EnrollmentCompletionPageConfigurationPolicySetItem extends PolicySetItem implements Parsable {
    /** Priority of the Windows10EnrollmentCompletionPageConfigurationPolicySetItem. */
    private Integer _priority;
    /**
     * Instantiates a new Windows10EnrollmentCompletionPageConfigurationPolicySetItem and sets the default values.
     * @return a void
     */
    public Windows10EnrollmentCompletionPageConfigurationPolicySetItem() {
        super();
        this.setOdataType("#microsoft.graph.windows10EnrollmentCompletionPageConfigurationPolicySetItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10EnrollmentCompletionPageConfigurationPolicySetItem
     */
    @javax.annotation.Nonnull
    public static Windows10EnrollmentCompletionPageConfigurationPolicySetItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EnrollmentCompletionPageConfigurationPolicySetItem();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10EnrollmentCompletionPageConfigurationPolicySetItem currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the priority property value. Priority of the Windows10EnrollmentCompletionPageConfigurationPolicySetItem.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("priority", this.getPriority());
    }
    /**
     * Sets the priority property value. Priority of the Windows10EnrollmentCompletionPageConfigurationPolicySetItem.
     * @param value Value to set for the priority property.
     * @return a void
     */
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
}
