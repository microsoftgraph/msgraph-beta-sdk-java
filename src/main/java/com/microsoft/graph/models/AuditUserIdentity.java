package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuditUserIdentity extends UserIdentity implements Parsable {
    /** For user sign ins, the identifier of the tenant that the user is a member of. */
    private String _homeTenantId;
    /** For user sign ins, the name of the tenant that the user is a member of. Only populated in cases where the home tenant has provided affirmative consent to Azure AD to show the tenant content. */
    private String _homeTenantName;
    /**
     * Instantiates a new AuditUserIdentity and sets the default values.
     * @return a void
     */
    public AuditUserIdentity() {
        super();
        this.setOdataType("#microsoft.graph.auditUserIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuditUserIdentity
     */
    @javax.annotation.Nonnull
    public static AuditUserIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditUserIdentity();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuditUserIdentity currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("homeTenantId", (n) -> { currentObject.setHomeTenantId(n.getStringValue()); });
            this.put("homeTenantName", (n) -> { currentObject.setHomeTenantName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the homeTenantId property value. For user sign ins, the identifier of the tenant that the user is a member of.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHomeTenantId() {
        return this._homeTenantId;
    }
    /**
     * Gets the homeTenantName property value. For user sign ins, the name of the tenant that the user is a member of. Only populated in cases where the home tenant has provided affirmative consent to Azure AD to show the tenant content.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHomeTenantName() {
        return this._homeTenantName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("homeTenantId", this.getHomeTenantId());
        writer.writeStringValue("homeTenantName", this.getHomeTenantName());
    }
    /**
     * Sets the homeTenantId property value. For user sign ins, the identifier of the tenant that the user is a member of.
     * @param value Value to set for the homeTenantId property.
     * @return a void
     */
    public void setHomeTenantId(@javax.annotation.Nullable final String value) {
        this._homeTenantId = value;
    }
    /**
     * Sets the homeTenantName property value. For user sign ins, the name of the tenant that the user is a member of. Only populated in cases where the home tenant has provided affirmative consent to Azure AD to show the tenant content.
     * @param value Value to set for the homeTenantName property.
     * @return a void
     */
    public void setHomeTenantName(@javax.annotation.Nullable final String value) {
        this._homeTenantName = value;
    }
}
