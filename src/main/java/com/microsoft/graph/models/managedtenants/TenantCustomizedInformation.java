package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class TenantCustomizedInformation extends Entity implements Parsable {
    /** The collection of contacts for the managed tenant. Optional. */
    private java.util.List<TenantContactInformation> _contacts;
    /** The display name for the managed tenant. Required. Read-only. */
    private String _displayName;
    /** The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only. */
    private String _tenantId;
    /** The website for the managed tenant. Required. */
    private String _website;
    /**
     * Instantiates a new tenantCustomizedInformation and sets the default values.
     * @return a void
     */
    public TenantCustomizedInformation() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.tenantCustomizedInformation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantCustomizedInformation
     */
    @javax.annotation.Nonnull
    public static TenantCustomizedInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantCustomizedInformation();
    }
    /**
     * Gets the contacts property value. The collection of contacts for the managed tenant. Optional.
     * @return a tenantContactInformation
     */
    @javax.annotation.Nullable
    public java.util.List<TenantContactInformation> getContacts() {
        return this._contacts;
    }
    /**
     * Gets the displayName property value. The display name for the managed tenant. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TenantCustomizedInformation currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("contacts", (n) -> { currentObject.setContacts(n.getCollectionOfObjectValues(TenantContactInformation::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
            this.put("website", (n) -> { currentObject.setWebsite(n.getStringValue()); });
        }};
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Gets the website property value. The website for the managed tenant. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebsite() {
        return this._website;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("contacts", this.getContacts());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("website", this.getWebsite());
    }
    /**
     * Sets the contacts property value. The collection of contacts for the managed tenant. Optional.
     * @param value Value to set for the contacts property.
     * @return a void
     */
    public void setContacts(@javax.annotation.Nullable final java.util.List<TenantContactInformation> value) {
        this._contacts = value;
    }
    /**
     * Sets the displayName property value. The display name for the managed tenant. Required. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the website property value. The website for the managed tenant. Required.
     * @param value Value to set for the website property.
     * @return a void
     */
    public void setWebsite(@javax.annotation.Nullable final String value) {
        this._website = value;
    }
}
