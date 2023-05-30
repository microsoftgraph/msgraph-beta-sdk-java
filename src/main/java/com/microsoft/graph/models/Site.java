package com.microsoft.graph.models;

import com.microsoft.graph.models.termstore.Store;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Site extends BaseItem implements Parsable {
    /** Analytics about the view activities that took place in this site. */
    private ItemAnalytics analytics;
    /** The collection of column definitions reusable across lists under this site. */
    private java.util.List<ColumnDefinition> columns;
    /** The collection of content types defined for this site. */
    private java.util.List<ContentType> contentTypes;
    /** The deleted property */
    private Deleted deleted;
    /** The full title for the site. Read-only. */
    private String displayName;
    /** The default drive (document library) for this site. */
    private Drive drive;
    /** The collection of drives (document libraries) under this site. */
    private java.util.List<Drive> drives;
    /** The collection of column definitions available in the site that are referenced from the sites in the parent hierarchy of the current site. */
    private java.util.List<ColumnDefinition> externalColumns;
    /** The informationProtection property */
    private InformationProtection informationProtection;
    /** Used to address any item contained in this site. This collection cannot be enumerated. */
    private java.util.List<BaseItem> items;
    /** The collection of lists under this site. */
    private java.util.List<List> lists;
    /** The onenote property */
    private Onenote onenote;
    /** The collection of long running operations for the site. */
    private java.util.List<RichLongRunningOperation> operations;
    /** The collection of pages in the SitePages list in this site. */
    private java.util.List<SitePage> pages;
    /** The permissions associated with the site. Nullable. */
    private java.util.List<Permission> permissions;
    /** If present, indicates that this is the root site in the site collection. Read-only. */
    private Root root;
    /** The settings on this site. Read-only. */
    private SiteSettings settings;
    /** Returns identifiers useful for SharePoint REST compatibility. Read-only. */
    private SharepointIds sharepointIds;
    /** Provides details about the site's site collection. Available only on the root site. Read-only. */
    private SiteCollection siteCollection;
    /** The collection of the sub-sites under this site. */
    private java.util.List<Site> sites;
    /** The termStore under this site. */
    private Store termStore;
    /**
     * Instantiates a new Site and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Site() {
        super();
        this.setOdataType("#microsoft.graph.site");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Site
     */
    @javax.annotation.Nonnull
    public static Site createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Site();
    }
    /**
     * Gets the analytics property value. Analytics about the view activities that took place in this site.
     * @return a itemAnalytics
     */
    @javax.annotation.Nullable
    public ItemAnalytics getAnalytics() {
        return this.analytics;
    }
    /**
     * Gets the columns property value. The collection of column definitions reusable across lists under this site.
     * @return a columnDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<ColumnDefinition> getColumns() {
        return this.columns;
    }
    /**
     * Gets the contentTypes property value. The collection of content types defined for this site.
     * @return a contentType
     */
    @javax.annotation.Nullable
    public java.util.List<ContentType> getContentTypes() {
        return this.contentTypes;
    }
    /**
     * Gets the deleted property value. The deleted property
     * @return a deleted
     */
    @javax.annotation.Nullable
    public Deleted getDeleted() {
        return this.deleted;
    }
    /**
     * Gets the displayName property value. The full title for the site. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the drive property value. The default drive (document library) for this site.
     * @return a drive
     */
    @javax.annotation.Nullable
    public Drive getDrive() {
        return this.drive;
    }
    /**
     * Gets the drives property value. The collection of drives (document libraries) under this site.
     * @return a drive
     */
    @javax.annotation.Nullable
    public java.util.List<Drive> getDrives() {
        return this.drives;
    }
    /**
     * Gets the externalColumns property value. The collection of column definitions available in the site that are referenced from the sites in the parent hierarchy of the current site.
     * @return a columnDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<ColumnDefinition> getExternalColumns() {
        return this.externalColumns;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("analytics", (n) -> { this.setAnalytics(n.getObjectValue(ItemAnalytics::createFromDiscriminatorValue)); });
        deserializerMap.put("columns", (n) -> { this.setColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("contentTypes", (n) -> { this.setContentTypes(n.getCollectionOfObjectValues(ContentType::createFromDiscriminatorValue)); });
        deserializerMap.put("deleted", (n) -> { this.setDeleted(n.getObjectValue(Deleted::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("drive", (n) -> { this.setDrive(n.getObjectValue(Drive::createFromDiscriminatorValue)); });
        deserializerMap.put("drives", (n) -> { this.setDrives(n.getCollectionOfObjectValues(Drive::createFromDiscriminatorValue)); });
        deserializerMap.put("externalColumns", (n) -> { this.setExternalColumns(n.getCollectionOfObjectValues(ColumnDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("informationProtection", (n) -> { this.setInformationProtection(n.getObjectValue(InformationProtection::createFromDiscriminatorValue)); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(BaseItem::createFromDiscriminatorValue)); });
        deserializerMap.put("lists", (n) -> { this.setLists(n.getCollectionOfObjectValues(List::createFromDiscriminatorValue)); });
        deserializerMap.put("onenote", (n) -> { this.setOnenote(n.getObjectValue(Onenote::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(RichLongRunningOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("pages", (n) -> { this.setPages(n.getCollectionOfObjectValues(SitePage::createFromDiscriminatorValue)); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfObjectValues(Permission::createFromDiscriminatorValue)); });
        deserializerMap.put("root", (n) -> { this.setRoot(n.getObjectValue(Root::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(SiteSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("sharepointIds", (n) -> { this.setSharepointIds(n.getObjectValue(SharepointIds::createFromDiscriminatorValue)); });
        deserializerMap.put("siteCollection", (n) -> { this.setSiteCollection(n.getObjectValue(SiteCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("sites", (n) -> { this.setSites(n.getCollectionOfObjectValues(Site::createFromDiscriminatorValue)); });
        deserializerMap.put("termStore", (n) -> { this.setTermStore(n.getObjectValue(Store::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the informationProtection property value. The informationProtection property
     * @return a informationProtection
     */
    @javax.annotation.Nullable
    public InformationProtection getInformationProtection() {
        return this.informationProtection;
    }
    /**
     * Gets the items property value. Used to address any item contained in this site. This collection cannot be enumerated.
     * @return a baseItem
     */
    @javax.annotation.Nullable
    public java.util.List<BaseItem> getItems() {
        return this.items;
    }
    /**
     * Gets the lists property value. The collection of lists under this site.
     * @return a list
     */
    @javax.annotation.Nullable
    public java.util.List<List> getLists() {
        return this.lists;
    }
    /**
     * Gets the onenote property value. The onenote property
     * @return a onenote
     */
    @javax.annotation.Nullable
    public Onenote getOnenote() {
        return this.onenote;
    }
    /**
     * Gets the operations property value. The collection of long running operations for the site.
     * @return a richLongRunningOperation
     */
    @javax.annotation.Nullable
    public java.util.List<RichLongRunningOperation> getOperations() {
        return this.operations;
    }
    /**
     * Gets the pages property value. The collection of pages in the SitePages list in this site.
     * @return a sitePage
     */
    @javax.annotation.Nullable
    public java.util.List<SitePage> getPages() {
        return this.pages;
    }
    /**
     * Gets the permissions property value. The permissions associated with the site. Nullable.
     * @return a permission
     */
    @javax.annotation.Nullable
    public java.util.List<Permission> getPermissions() {
        return this.permissions;
    }
    /**
     * Gets the root property value. If present, indicates that this is the root site in the site collection. Read-only.
     * @return a root
     */
    @javax.annotation.Nullable
    public Root getRoot() {
        return this.root;
    }
    /**
     * Gets the settings property value. The settings on this site. Read-only.
     * @return a siteSettings
     */
    @javax.annotation.Nullable
    public SiteSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @return a sharepointIds
     */
    @javax.annotation.Nullable
    public SharepointIds getSharepointIds() {
        return this.sharepointIds;
    }
    /**
     * Gets the siteCollection property value. Provides details about the site's site collection. Available only on the root site. Read-only.
     * @return a siteCollection
     */
    @javax.annotation.Nullable
    public SiteCollection getSiteCollection() {
        return this.siteCollection;
    }
    /**
     * Gets the sites property value. The collection of the sub-sites under this site.
     * @return a site
     */
    @javax.annotation.Nullable
    public java.util.List<Site> getSites() {
        return this.sites;
    }
    /**
     * Gets the termStore property value. The termStore under this site.
     * @return a store
     */
    @javax.annotation.Nullable
    public Store getTermStore() {
        return this.termStore;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("analytics", this.getAnalytics());
        writer.writeCollectionOfObjectValues("columns", this.getColumns());
        writer.writeCollectionOfObjectValues("contentTypes", this.getContentTypes());
        writer.writeObjectValue("deleted", this.getDeleted());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("drive", this.getDrive());
        writer.writeCollectionOfObjectValues("drives", this.getDrives());
        writer.writeCollectionOfObjectValues("externalColumns", this.getExternalColumns());
        writer.writeObjectValue("informationProtection", this.getInformationProtection());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeCollectionOfObjectValues("lists", this.getLists());
        writer.writeObjectValue("onenote", this.getOnenote());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("pages", this.getPages());
        writer.writeCollectionOfObjectValues("permissions", this.getPermissions());
        writer.writeObjectValue("root", this.getRoot());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeObjectValue("sharepointIds", this.getSharepointIds());
        writer.writeObjectValue("siteCollection", this.getSiteCollection());
        writer.writeCollectionOfObjectValues("sites", this.getSites());
        writer.writeObjectValue("termStore", this.getTermStore());
    }
    /**
     * Sets the analytics property value. Analytics about the view activities that took place in this site.
     * @param value Value to set for the analytics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnalytics(@javax.annotation.Nullable final ItemAnalytics value) {
        this.analytics = value;
    }
    /**
     * Sets the columns property value. The collection of column definitions reusable across lists under this site.
     * @param value Value to set for the columns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColumns(@javax.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this.columns = value;
    }
    /**
     * Sets the contentTypes property value. The collection of content types defined for this site.
     * @param value Value to set for the contentTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentTypes(@javax.annotation.Nullable final java.util.List<ContentType> value) {
        this.contentTypes = value;
    }
    /**
     * Sets the deleted property value. The deleted property
     * @param value Value to set for the deleted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeleted(@javax.annotation.Nullable final Deleted value) {
        this.deleted = value;
    }
    /**
     * Sets the displayName property value. The full title for the site. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the drive property value. The default drive (document library) for this site.
     * @param value Value to set for the drive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDrive(@javax.annotation.Nullable final Drive value) {
        this.drive = value;
    }
    /**
     * Sets the drives property value. The collection of drives (document libraries) under this site.
     * @param value Value to set for the drives property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDrives(@javax.annotation.Nullable final java.util.List<Drive> value) {
        this.drives = value;
    }
    /**
     * Sets the externalColumns property value. The collection of column definitions available in the site that are referenced from the sites in the parent hierarchy of the current site.
     * @param value Value to set for the externalColumns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalColumns(@javax.annotation.Nullable final java.util.List<ColumnDefinition> value) {
        this.externalColumns = value;
    }
    /**
     * Sets the informationProtection property value. The informationProtection property
     * @param value Value to set for the informationProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInformationProtection(@javax.annotation.Nullable final InformationProtection value) {
        this.informationProtection = value;
    }
    /**
     * Sets the items property value. Used to address any item contained in this site. This collection cannot be enumerated.
     * @param value Value to set for the items property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItems(@javax.annotation.Nullable final java.util.List<BaseItem> value) {
        this.items = value;
    }
    /**
     * Sets the lists property value. The collection of lists under this site.
     * @param value Value to set for the lists property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLists(@javax.annotation.Nullable final java.util.List<List> value) {
        this.lists = value;
    }
    /**
     * Sets the onenote property value. The onenote property
     * @param value Value to set for the onenote property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnenote(@javax.annotation.Nullable final Onenote value) {
        this.onenote = value;
    }
    /**
     * Sets the operations property value. The collection of long running operations for the site.
     * @param value Value to set for the operations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperations(@javax.annotation.Nullable final java.util.List<RichLongRunningOperation> value) {
        this.operations = value;
    }
    /**
     * Sets the pages property value. The collection of pages in the SitePages list in this site.
     * @param value Value to set for the pages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPages(@javax.annotation.Nullable final java.util.List<SitePage> value) {
        this.pages = value;
    }
    /**
     * Sets the permissions property value. The permissions associated with the site. Nullable.
     * @param value Value to set for the permissions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermissions(@javax.annotation.Nullable final java.util.List<Permission> value) {
        this.permissions = value;
    }
    /**
     * Sets the root property value. If present, indicates that this is the root site in the site collection. Read-only.
     * @param value Value to set for the root property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoot(@javax.annotation.Nullable final Root value) {
        this.root = value;
    }
    /**
     * Sets the settings property value. The settings on this site. Read-only.
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final SiteSettings value) {
        this.settings = value;
    }
    /**
     * Sets the sharepointIds property value. Returns identifiers useful for SharePoint REST compatibility. Read-only.
     * @param value Value to set for the sharepointIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharepointIds(@javax.annotation.Nullable final SharepointIds value) {
        this.sharepointIds = value;
    }
    /**
     * Sets the siteCollection property value. Provides details about the site's site collection. Available only on the root site. Read-only.
     * @param value Value to set for the siteCollection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteCollection(@javax.annotation.Nullable final SiteCollection value) {
        this.siteCollection = value;
    }
    /**
     * Sets the sites property value. The collection of the sub-sites under this site.
     * @param value Value to set for the sites property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSites(@javax.annotation.Nullable final java.util.List<Site> value) {
        this.sites = value;
    }
    /**
     * Sets the termStore property value. The termStore under this site.
     * @param value Value to set for the termStore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTermStore(@javax.annotation.Nullable final Store value) {
        this.termStore = value;
    }
}
