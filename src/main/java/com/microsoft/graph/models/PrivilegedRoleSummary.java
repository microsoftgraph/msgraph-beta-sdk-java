package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of privilegedApproval entities. */
public class PrivilegedRoleSummary extends Entity implements Parsable {
    /** The number of users that have the role assigned and the role is activated. */
    private Integer _elevatedCount;
    /** The number of users that have the role assigned but the role is deactivated. */
    private Integer _managedCount;
    /** true if the role activation requires MFA. false if the role activation doesn't require MFA. */
    private Boolean _mfaEnabled;
    /** Possible values are: ok, bad. The value depends on the ratio of (managedCount / usersCount). If the ratio is less than a predefined threshold, ok is returned. Otherwise, bad is returned. */
    private RoleSummaryStatus _status;
    /** The number of users that are assigned with the role. */
    private Integer _usersCount;
    /**
     * Instantiates a new privilegedRoleSummary and sets the default values.
     * @return a void
     */
    public PrivilegedRoleSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedRoleSummary
     */
    @javax.annotation.Nonnull
    public static PrivilegedRoleSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedRoleSummary();
    }
    /**
     * Gets the elevatedCount property value. The number of users that have the role assigned and the role is activated.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getElevatedCount() {
        return this._elevatedCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrivilegedRoleSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("elevatedCount", (n) -> { currentObject.setElevatedCount(n.getIntegerValue()); });
            this.put("managedCount", (n) -> { currentObject.setManagedCount(n.getIntegerValue()); });
            this.put("mfaEnabled", (n) -> { currentObject.setMfaEnabled(n.getBooleanValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(RoleSummaryStatus.class)); });
            this.put("usersCount", (n) -> { currentObject.setUsersCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the managedCount property value. The number of users that have the role assigned but the role is deactivated.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getManagedCount() {
        return this._managedCount;
    }
    /**
     * Gets the mfaEnabled property value. true if the role activation requires MFA. false if the role activation doesn't require MFA.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMfaEnabled() {
        return this._mfaEnabled;
    }
    /**
     * Gets the status property value. Possible values are: ok, bad. The value depends on the ratio of (managedCount / usersCount). If the ratio is less than a predefined threshold, ok is returned. Otherwise, bad is returned.
     * @return a roleSummaryStatus
     */
    @javax.annotation.Nullable
    public RoleSummaryStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the usersCount property value. The number of users that are assigned with the role.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUsersCount() {
        return this._usersCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("elevatedCount", this.getElevatedCount());
        writer.writeIntegerValue("managedCount", this.getManagedCount());
        writer.writeBooleanValue("mfaEnabled", this.getMfaEnabled());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeIntegerValue("usersCount", this.getUsersCount());
    }
    /**
     * Sets the elevatedCount property value. The number of users that have the role assigned and the role is activated.
     * @param value Value to set for the elevatedCount property.
     * @return a void
     */
    public void setElevatedCount(@javax.annotation.Nullable final Integer value) {
        this._elevatedCount = value;
    }
    /**
     * Sets the managedCount property value. The number of users that have the role assigned but the role is deactivated.
     * @param value Value to set for the managedCount property.
     * @return a void
     */
    public void setManagedCount(@javax.annotation.Nullable final Integer value) {
        this._managedCount = value;
    }
    /**
     * Sets the mfaEnabled property value. true if the role activation requires MFA. false if the role activation doesn't require MFA.
     * @param value Value to set for the mfaEnabled property.
     * @return a void
     */
    public void setMfaEnabled(@javax.annotation.Nullable final Boolean value) {
        this._mfaEnabled = value;
    }
    /**
     * Sets the status property value. Possible values are: ok, bad. The value depends on the ratio of (managedCount / usersCount). If the ratio is less than a predefined threshold, ok is returned. Otherwise, bad is returned.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final RoleSummaryStatus value) {
        this._status = value;
    }
    /**
     * Sets the usersCount property value. The number of users that are assigned with the role.
     * @param value Value to set for the usersCount property.
     * @return a void
     */
    public void setUsersCount(@javax.annotation.Nullable final Integer value) {
        this._usersCount = value;
    }
}
