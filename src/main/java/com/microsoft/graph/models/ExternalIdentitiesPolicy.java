package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExternalIdentitiesPolicy extends PolicyBase implements Parsable {
    /** The allowDeletedIdentitiesDataRemoval property */
    private Boolean _allowDeletedIdentitiesDataRemoval;
    /** The allowExternalIdentitiesToLeave property */
    private Boolean _allowExternalIdentitiesToLeave;
    /**
     * Instantiates a new externalIdentitiesPolicy and sets the default values.
     * @return a void
     */
    public ExternalIdentitiesPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a externalIdentitiesPolicy
     */
    @javax.annotation.Nonnull
    public static ExternalIdentitiesPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalIdentitiesPolicy();
    }
    /**
     * Gets the allowDeletedIdentitiesDataRemoval property value. The allowDeletedIdentitiesDataRemoval property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowDeletedIdentitiesDataRemoval() {
        return this._allowDeletedIdentitiesDataRemoval;
    }
    /**
     * Gets the allowExternalIdentitiesToLeave property value. The allowExternalIdentitiesToLeave property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowExternalIdentitiesToLeave() {
        return this._allowExternalIdentitiesToLeave;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExternalIdentitiesPolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowDeletedIdentitiesDataRemoval", (n) -> { currentObject.setAllowDeletedIdentitiesDataRemoval(n.getBooleanValue()); });
            this.put("allowExternalIdentitiesToLeave", (n) -> { currentObject.setAllowExternalIdentitiesToLeave(n.getBooleanValue()); });
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
        writer.writeBooleanValue("allowDeletedIdentitiesDataRemoval", this.getAllowDeletedIdentitiesDataRemoval());
        writer.writeBooleanValue("allowExternalIdentitiesToLeave", this.getAllowExternalIdentitiesToLeave());
    }
    /**
     * Sets the allowDeletedIdentitiesDataRemoval property value. The allowDeletedIdentitiesDataRemoval property
     * @param value Value to set for the allowDeletedIdentitiesDataRemoval property.
     * @return a void
     */
    public void setAllowDeletedIdentitiesDataRemoval(@javax.annotation.Nullable final Boolean value) {
        this._allowDeletedIdentitiesDataRemoval = value;
    }
    /**
     * Sets the allowExternalIdentitiesToLeave property value. The allowExternalIdentitiesToLeave property
     * @param value Value to set for the allowExternalIdentitiesToLeave property.
     * @return a void
     */
    public void setAllowExternalIdentitiesToLeave(@javax.annotation.Nullable final Boolean value) {
        this._allowExternalIdentitiesToLeave = value;
    }
}
