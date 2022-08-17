package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class UnifiedRbacResourceNamespace extends Entity implements Parsable {
    /** Name of the resource namespace. Typically, the same name as the id property, such as microsoft.aad.b2c. Required. Supports $filter (eq, startsWith). */
    private String _name;
    /** Operations that an authorized principal are allowed to perform. */
    private java.util.List<UnifiedRbacResourceAction> _resourceActions;
    /**
     * Instantiates a new unifiedRbacResourceNamespace and sets the default values.
     * @return a void
     */
    public UnifiedRbacResourceNamespace() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRbacResourceNamespace");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRbacResourceNamespace
     */
    @javax.annotation.Nonnull
    public static UnifiedRbacResourceNamespace createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRbacResourceNamespace();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnifiedRbacResourceNamespace currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("resourceActions", (n) -> { currentObject.setResourceActions(n.getCollectionOfObjectValues(UnifiedRbacResourceAction::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the name property value. Name of the resource namespace. Typically, the same name as the id property, such as microsoft.aad.b2c. Required. Supports $filter (eq, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the resourceActions property value. Operations that an authorized principal are allowed to perform.
     * @return a unifiedRbacResourceAction
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRbacResourceAction> getResourceActions() {
        return this._resourceActions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("resourceActions", this.getResourceActions());
    }
    /**
     * Sets the name property value. Name of the resource namespace. Typically, the same name as the id property, such as microsoft.aad.b2c. Required. Supports $filter (eq, startsWith).
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the resourceActions property value. Operations that an authorized principal are allowed to perform.
     * @param value Value to set for the resourceActions property.
     * @return a void
     */
    public void setResourceActions(@javax.annotation.Nullable final java.util.List<UnifiedRbacResourceAction> value) {
        this._resourceActions = value;
    }
}
