package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the policyRoot singleton. */
public class TenantRelationshipAccessPolicyBase extends PolicyBase implements Parsable {
    /** The definition property */
    private java.util.List<String> _definition;
    /**
     * Instantiates a new tenantRelationshipAccessPolicyBase and sets the default values.
     * @return a void
     */
    public TenantRelationshipAccessPolicyBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantRelationshipAccessPolicyBase
     */
    @javax.annotation.Nonnull
    public static TenantRelationshipAccessPolicyBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.tenantRelationshipAccessPolicyBase": return new TenantRelationshipAccessPolicyBase();
            }
        }
        return new TenantRelationshipAccessPolicyBase();
    }
    /**
     * Gets the definition property value. The definition property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefinition() {
        return this._definition;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TenantRelationshipAccessPolicyBase currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("definition", (n) -> { currentObject.setDefinition(n.getCollectionOfPrimitiveValues(String.class)); });
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
        writer.writeCollectionOfPrimitiveValues("definition", this.getDefinition());
    }
    /**
     * Sets the definition property value. The definition property
     * @param value Value to set for the definition property.
     * @return a void
     */
    public void setDefinition(@javax.annotation.Nullable final java.util.List<String> value) {
        this._definition = value;
    }
}
