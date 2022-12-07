package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Office365GroupsActivityStorage extends Entity implements Parsable {
    /** The storage used in group mailbox. */
    private Long _mailboxStorageUsedInBytes;
    /** The snapshot date for Exchange and SharePoint used storage. */
    private LocalDate _reportDate;
    /** The number of days the report covers. */
    private String _reportPeriod;
    /** The latest date of the content. */
    private LocalDate _reportRefreshDate;
    /** The storage used in SharePoint document library. */
    private Long _siteStorageUsedInBytes;
    /**
     * Instantiates a new Office365GroupsActivityStorage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Office365GroupsActivityStorage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Office365GroupsActivityStorage
     */
    @javax.annotation.Nonnull
    public static Office365GroupsActivityStorage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Office365GroupsActivityStorage();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("mailboxStorageUsedInBytes", (n) -> { this.setMailboxStorageUsedInBytes(n.getLongValue()); });
        deserializerMap.put("reportDate", (n) -> { this.setReportDate(n.getLocalDateValue()); });
        deserializerMap.put("reportPeriod", (n) -> { this.setReportPeriod(n.getStringValue()); });
        deserializerMap.put("reportRefreshDate", (n) -> { this.setReportRefreshDate(n.getLocalDateValue()); });
        deserializerMap.put("siteStorageUsedInBytes", (n) -> { this.setSiteStorageUsedInBytes(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mailboxStorageUsedInBytes property value. The storage used in group mailbox.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMailboxStorageUsedInBytes() {
        return this._mailboxStorageUsedInBytes;
    }
    /**
     * Gets the reportDate property value. The snapshot date for Exchange and SharePoint used storage.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getReportDate() {
        return this._reportDate;
    }
    /**
     * Gets the reportPeriod property value. The number of days the report covers.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReportPeriod() {
        return this._reportPeriod;
    }
    /**
     * Gets the reportRefreshDate property value. The latest date of the content.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getReportRefreshDate() {
        return this._reportRefreshDate;
    }
    /**
     * Gets the siteStorageUsedInBytes property value. The storage used in SharePoint document library.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSiteStorageUsedInBytes() {
        return this._siteStorageUsedInBytes;
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
        writer.writeLongValue("mailboxStorageUsedInBytes", this.getMailboxStorageUsedInBytes());
        writer.writeLocalDateValue("reportDate", this.getReportDate());
        writer.writeStringValue("reportPeriod", this.getReportPeriod());
        writer.writeLocalDateValue("reportRefreshDate", this.getReportRefreshDate());
        writer.writeLongValue("siteStorageUsedInBytes", this.getSiteStorageUsedInBytes());
    }
    /**
     * Sets the mailboxStorageUsedInBytes property value. The storage used in group mailbox.
     * @param value Value to set for the mailboxStorageUsedInBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMailboxStorageUsedInBytes(@javax.annotation.Nullable final Long value) {
        this._mailboxStorageUsedInBytes = value;
    }
    /**
     * Sets the reportDate property value. The snapshot date for Exchange and SharePoint used storage.
     * @param value Value to set for the reportDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReportDate(@javax.annotation.Nullable final LocalDate value) {
        this._reportDate = value;
    }
    /**
     * Sets the reportPeriod property value. The number of days the report covers.
     * @param value Value to set for the reportPeriod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReportPeriod(@javax.annotation.Nullable final String value) {
        this._reportPeriod = value;
    }
    /**
     * Sets the reportRefreshDate property value. The latest date of the content.
     * @param value Value to set for the reportRefreshDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReportRefreshDate(@javax.annotation.Nullable final LocalDate value) {
        this._reportRefreshDate = value;
    }
    /**
     * Sets the siteStorageUsedInBytes property value. The storage used in SharePoint document library.
     * @param value Value to set for the siteStorageUsedInBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteStorageUsedInBytes(@javax.annotation.Nullable final Long value) {
        this._siteStorageUsedInBytes = value;
    }
}
